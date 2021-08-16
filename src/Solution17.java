import java.util.ArrayList;
import java.util.Arrays;

// 프로그래머스 제일 작은 수 제거하기
class Solution17 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = 0;

        if(arr.length <= 1){
            answer = new int[]{-1};
            return answer;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i:arr) {
            arrayList.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[min] > arr[i]){
                min = i;
            }
        }

        arrayList.remove(min);

        for (int j = 0; j < arrayList.size(); j++) {
            answer[j] = arrayList.get(j);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int arr[] = {4,3,2,1};

        System.out.println(Arrays.toString(solution17.solution(arr)));
    }
}

