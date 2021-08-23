// 프로그래머스 서울에서 김서방 찾기
class Solution35 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i +"에 있다";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();

        String[] seoul = {"Jane", "Kim"};

        System.out.println(solution35.solution(seoul));
    }
}

