// 프로그래머스 소수 찾기
class Solution30 {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            num[i] = i;
        }

        for (int j = 2; j <= n; j++) {
            if(num[j] == 0){
                continue;
            }
            for (int k = 2 * j; k <= n; k+=j){
                num[k] = 0;
            }
        }

        for (int l = 0; l < num.length; l++){
            if (num[l] != 0){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        int n = 10;

        System.out.println(solution30.solution(n));
    }
}

