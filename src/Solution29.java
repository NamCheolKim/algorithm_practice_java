import java.util.regex.Pattern;

// 프로그래머스 문자열 다루기 기본
class Solution29 {
    public boolean solution(String s) {
        boolean answer;

        if(!(s.length() == 4 || s.length() == 6)){
            return false;
        }

        answer = Pattern.matches("[0-9]*$", s); // 정규표현식 숫자

        return answer;

    }
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        String s = "a234";

        System.out.println(solution29.solution(s));
    }
}

