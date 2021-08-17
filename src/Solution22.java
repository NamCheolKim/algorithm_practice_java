import java.util.Arrays;

// 프로그래머스 가운데 글자 가져오기
class Solution22 {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 0){
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }else{
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        String s = "abcde";

        System.out.println(solution22.solution(s));
    }
}

