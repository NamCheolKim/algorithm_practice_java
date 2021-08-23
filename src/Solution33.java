import java.util.ArrayList;
import java.util.Arrays;

// 프로그래머스 나누어 떨어지는 숫자 배열
class Solution33 {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arr);

        for (int i : arr) {
            if (i % divisor == 0) {
                arrayList.add(i);
            }
        }
/*
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                arrayList.add(arr[i]);
            }
        }
*/

        if(arrayList.size() == 0){
            return new int[]{-1};
        }

        int[] answer = new int[arrayList.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = arrayList.get(j);
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(solution33.solution(arr, divisor)));
    }
}

