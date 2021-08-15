import java.util.Arrays;

// 프로그래머스 행렬의 덧셈
class Solution14 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;

        for(int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
               answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        System.out.println(Arrays.deepToString(solution14.solution(arr1,arr2)));
    }
}

