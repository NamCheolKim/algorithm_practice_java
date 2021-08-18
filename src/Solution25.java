// 프로그래머스 자릿수 더하기
class Solution25 {
    public int solution(int n) {
        int answer = 0;
        String[] str = String.valueOf(n).split("");

        for (String s : str) {
            answer += Integer.parseInt(s);
        }

/*
        for (int i = 0; i < str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
*/

        return answer;
    }

    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        int N = 123;

        System.out.println(solution25.solution(N));
    }
}

