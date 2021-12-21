// 프로그래머스 없는 숫자 더하기
public class Solution47 {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int number: numbers) {
            answer -= number;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(solution47.solution(numbers));
    }
}
