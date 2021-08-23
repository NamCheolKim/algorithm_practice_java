// 프로그래머스 약수의 합
class Solution34 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();

        int n = 5;

        System.out.println(solution34.solution(n));
    }
}

