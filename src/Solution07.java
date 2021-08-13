// 프로그래머스 숫자 문자열과 영단어
class Solution07 {
    public int solution(String s) {
        int answer = 0;
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++){
            s = s.replace(word[i], number[i]);
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        Solution07 solution07 = new Solution07();
        String s = "one4seveneight";

        System.out.println(solution07.solution(s));
    }
}
