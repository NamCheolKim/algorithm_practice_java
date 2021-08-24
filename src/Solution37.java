import java.util.ArrayList;
import java.util.Arrays;

// 프로그래머스 두 개 뽑아서 더하기
class Solution37 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if(!arrayList.contains(sum)){
                    arrayList.add(sum);
                }
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int k = 0; k < answer.length; k++) {
            answer[k] = arrayList.get(k);
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();

        int[] numbers = {2,1,3,4,1};

        System.out.println(Arrays.toString(solution37.solution(numbers)));
    }
}

