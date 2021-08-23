// 문자열 내 p와 y의 개수
class Solution32 {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p_cnt ++;
            }else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                y_cnt ++;
            }
        }

        if (p_cnt != y_cnt){
            return false;
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        String s = "pPoooyY";

        System.out.println(solution32.solution(s));
    }
}

