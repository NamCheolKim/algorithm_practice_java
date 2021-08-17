import java.util.Arrays;

// 프로그래머스 최대공약수와 최소공배수
class Solution20 {
    public int[] solution(int n, int m) {
        int[] answer = {};

        int min = Math.min(n,m);
        int max = Math.max(n,m);
        int temp = 0;

        while (min > 0){
            temp = min;
            min = max % min;
            max = temp;
        }

        answer = new int[]{max, n * m / max};

        return answer;
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int n = 3;
        int m = 12;

        System.out.println(Arrays.toString(solution20.solution(n, m)));
    }
}

