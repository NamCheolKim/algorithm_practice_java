
// 프로그래머스 핸드폰 번호 가리기
class Solution12 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
//      String answer = "";

        answer.append("*".repeat(Math.max(0, phone_number.length() - 4)));
        answer.append(phone_number.substring(phone_number.length() - 4));

/*
        for(int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
*/

        return answer.toString();
    }
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        String phone_number = "01033334444";

        System.out.println(solution12.solution(phone_number));
    }
}

