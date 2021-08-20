import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 프로그래머스 자연수 뒤집어 배열로 만들기
class Solution28 {
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str));
        int[] answer = new int[str.length];

        Collections.reverse(arrayList);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arrayList.get(i));
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int n = 12345;

        System.out.println(Arrays.toString(solution28.solution(n)));
    }
}

