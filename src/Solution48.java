// 나머지가 1이 되는수 찾기
public class Solution48 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if(n % i == 1){
                answer = i;
                return answer;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        int n = 12;

        System.out.println(solution48.solution(n));
    }
}
