// 프로그래머스 평균 구하기
class Solution15 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }
        answer /= arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int[] arr1 = {1,2,3,4};

        System.out.println(solution15.solution(arr1));
    }
}

