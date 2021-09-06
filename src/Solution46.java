import java.util.Arrays;

// 프로그래머스 주식가격
class Solution46 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int sec = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] <= prices[j]){
                    sec++;
                }else{
                    sec++;
                    break;
                }
            }
            answer[i] = sec;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();

        int[] prices = {1, 2, 3, 2, 3};


        System.out.println(Arrays.toString(solution46.solution(prices)));
    }
}

