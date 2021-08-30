import java.util.ArrayList;
import java.util.Arrays;

// 프로그래머스 모의고사
class Solution43 {
    public int[] solution(int[] answers) {
        int[] math_give_up_person = new int[3]; // 수포자가 맞힌 정답 수
        int[] math_give_up_person1 = {1, 2, 3, 4, 5}; // 수포자 1이 찍는 방식
        int[] math_give_up_person2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 수포자 2가 찍는 방식
        int[] math_give_up_person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 수포자 3이 찍는방식

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == math_give_up_person1[i % math_give_up_person1.length]){ // 수포자 1이 찍은 답이 맞다면
                math_give_up_person[0]++; // 카운트 증가
            }
            if(answers[i] == math_give_up_person2[i % math_give_up_person2.length]){ // 수포자 2가 찍은 답이 맞다면
                math_give_up_person[1]++; // 카운트 증가
            }
            if(answers[i] == math_give_up_person3[i % math_give_up_person3.length]){ // 수포자 3이 찍은 답이 맞다면
                math_give_up_person[2]++; // 카운트 증가
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        int max_score = Math.max(Math.max(math_give_up_person[0], math_give_up_person[1]), math_give_up_person[2]); // 가장 많이 맞춘 수포자

        if(max_score == math_give_up_person[0]){ // 수포자 1이 가장 많이 맞췄다면
            arrayList.add(0);
        }
        if(max_score == math_give_up_person[1]){ // 수포자 2가 가장 많이 맞췄다면
            arrayList.add(1);
        }
        if(max_score == math_give_up_person[2]){ // 수포자 3이이가장 많이 맞췄다면
            arrayList.add(2);
        }

        int[] answer = new int[arrayList.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = arrayList.get(j) + 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();

        int[] answers = {1,2,3,4,5};

        System.out.println(Arrays.toString(solution43.solution(answers)));
    }
}

