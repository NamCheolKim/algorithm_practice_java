import java.util.Stack;

// 프로그래머스 짝지어 제거하기
class Solution45 {
    public int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        if(stack.isEmpty()){
            answer = 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();

        String s = "baabaa";


        System.out.println(solution45.solution(s));
    }
}

