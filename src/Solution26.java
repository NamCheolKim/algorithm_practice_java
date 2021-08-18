// 프로그래머스 두 정수 사이의 합
class Solution26 {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        if(a == b){
            return a;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int a = 3;
        int b = 5;

        System.out.println(solution26.solution(a, b));
    }
}

