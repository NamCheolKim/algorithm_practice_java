// 프로그래머스 두 개 뽑아서 더하기
class Solution38 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
                answer += a[i] * b[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();

        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(solution38.solution(a,b));
    }
}

