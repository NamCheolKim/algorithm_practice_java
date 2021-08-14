import java.util.Arrays;

// 프로그래머스 로또의 최고 순위와 최저 순위
class Solution09 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer =  new int[2]; // 최고 순위와 최저 순위를 리턴 할 배열 길이.
        int matchNum_cnt = 0; // 일치하는 번호 갯수.
        int unknownNum_cnt = 0; // 알아볼 수 없는 번호(0) 갯수

        for (int i = 0; i < 6; i++) {
            if(lottos[i] == 0){ // 알아볼 수 없는 번호(0)가 있다면
                unknownNum_cnt++;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]){ // 일치하는 번호가 있다면
                    matchNum_cnt++;
                }
            }
        }
        answer[0] = Math.min(7 - (matchNum_cnt + unknownNum_cnt), 6); // 최고 순위
        answer[1] = Math.min(7 - matchNum_cnt, 6); // 최저 순위
        return answer;
    }

    public static void main(String[] args) {
        Solution09 solution09 = new Solution09();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solution09.solution(lottos, win_nums)));
    }
}
