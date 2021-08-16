// 프로그래머스 정수 제곱근 판별
class Solution18 {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n);

        if(n == Math.pow(answer, 2)){
            return (long) Math.pow(answer + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int n = 3;

        System.out.println(solution18.solution(n));
    }
}

