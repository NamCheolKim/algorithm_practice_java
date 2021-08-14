// 프로그래머스 소수 만들기
class Solution10 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(check(sum)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean check(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int[] nums = {1,2,3,4};

        System.out.println(solution10.solution(nums));
    }
}
