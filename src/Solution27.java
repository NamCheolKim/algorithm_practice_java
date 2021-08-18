// 프로그래머스 이상한 문자 만들기
class Solution27 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = String.valueOf(s).split("");
        int cnt = 0;

        for (String value : str) {
            if (cnt % 2 == 0) {
                answer.append(value.toUpperCase());
            } else {
                answer.append(value.toLowerCase());
            }
            cnt++;

            if (value.equals(" ")) {
                cnt = 0;
            }
        }

/*
        for (int i = 0; i < str.length; i++) {
            if(cnt % 2 == 0){
                answer += str[i].toUpperCase();
            }else{
                answer += str[i].toLowerCase();
            }
            cnt ++;

            if (str[i].equals(" ")){
                cnt = 0;
            }
        }
*/
        
        return answer.toString();
    }
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        String s = "try hello world";

        System.out.println(solution27.solution(s));
    }
}

