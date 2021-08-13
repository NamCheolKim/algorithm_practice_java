import java.util.Arrays;

// 프로그래머스 예산
class Solution06 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            if(d[i] <= budget){
                budget -= d[i];
                cnt++;
            }
        }
        answer = cnt;

        return answer;
    }

    public static void main(String[] args) {
        Solution06 solution06 = new Solution06();
        int[] need_budget = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution06.solution(need_budget, budget));
    }
}
