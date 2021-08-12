// 프로그래머스 음양 더하기
class Solution03 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution03 plus_minus = new Solution03();
        int absolutes[] = {4, 7, 12};
        boolean signs[] = {true, false, true};

        System.out.println(plus_minus.solution(absolutes, signs));
    }
}

