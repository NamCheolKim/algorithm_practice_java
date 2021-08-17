import java.util.Arrays;

// 프로그래머스 x만큼 간격이 있는 n개의 숫자
class Solution21 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = (long) i * x + x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        int x = 2;
        int n = 5;

        System.out.println(Arrays.toString(solution21.solution(x, n)));
    }
}

