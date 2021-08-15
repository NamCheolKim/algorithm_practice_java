// 프로그래머스 짝수와 홀수
class Solution13 {
    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int number = 3;

        System.out.println(solution13.solution(number));
    }
}

