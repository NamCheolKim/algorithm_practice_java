// 프로그래머스 문자열을 정수로 바꾸기
class Solution24 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        String s = "-1234";

        System.out.println(solution24.solution(s));
    }
}

