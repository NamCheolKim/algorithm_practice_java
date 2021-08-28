import java.util.Arrays;

// 프로그래머스 최솟값 만들기
class Solution41 {
    public int solution(int []A, int []B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();

        int[] A = {1,4,2};
        int[] B = {5,4,4};

        System.out.println(solution41.solution(A,B));
    }
}

