// 프로그래머스 3진법 뒤집기
class Solution04 {
    public int solution(int n) {
        int answer = 0;
        String div_mod = "";

        while (n > 0){
            div_mod += Integer.toString(n % 3);
            n /= 3;
        }

        answer = Integer.parseInt(div_mod, 3);

        return answer;
    }
    public static void main(String[] args) {
        Solution04 reverse_ternary = new Solution04();
        int n = 45;

        System.out.println(reverse_ternary.solution(n));
    }
}