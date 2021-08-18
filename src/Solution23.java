import java.util.ArrayList;
import java.util.Arrays;

// 프로그래머스 같은 숫자는 싫어
class Solution23 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != arr[i + 1]){
                arrayList.add(arr[i]);
            }
        }
        arrayList.add(arr[arr.length - 1]);

        int[] answer = new int[arrayList.size()];

        for (int j = 0; j < answer.length; j++) {
            answer[j] = arrayList.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(Arrays.toString(solution23.solution(arr)));
    }
}

