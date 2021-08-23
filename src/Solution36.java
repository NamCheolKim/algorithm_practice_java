import java.util.Arrays;

// 프로그래머스 비밀지도
class Solution36 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 2진수 변환
        }

        for (int j = 0; j < n; j++) {
            answer[j] = String.format("%" + n + "s", answer[j]); // 자릿수 맞추기
            answer[j] = answer[j].replaceAll("1", "#");
            answer[j] = answer[j].replaceAll("0", " ");
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();

        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution36.solution(n, arr1, arr2)));
    }
}

