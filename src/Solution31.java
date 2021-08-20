// 프로그래머스 수박수박수박수박수박수?
class Solution31 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                answer.append("수");
            }else{
                answer.append("박");
            }
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int n = 3;

        System.out.println(solution31.solution(n));
    }
}

