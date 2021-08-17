// 프로그래머스 하샤드 수
class Solution19 {
    public boolean solution(int x) {
        boolean answer = true;

        String[] str = String.valueOf(x).split("");
        int sum = 0;

        for (String s : str) {
            sum += Integer.parseInt(s);
        }
/*
        for(int i = 0; i < str.length; i++){
            sum += Integer.parseInt(str[i]);
        }
*/

        if(x % sum != 0){
            answer = false;
            return  answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        int arr = 11;

        System.out.println(solution19.solution(arr));
    }
}

