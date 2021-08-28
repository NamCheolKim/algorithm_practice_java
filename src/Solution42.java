import java.util.ArrayList;
import java.util.Collections;

// 프로그래머스 최댓값과 최솟값
class Solution42 {
    public String solution(String s) {
        String answer;
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] str = s.split(" ");

        for (String i : str) {
            arrayList.add(Integer.parseInt(i));
        }
/*
        for (int i = 0; i < str.length; i++) {
            arrayList.add(Integer.parseInt(str[i]));
        }
*/

        answer = Collections.min(arrayList) + " " + Collections.max(arrayList);

        return answer;
    }
    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();

        String s = "1 2 3 4";

        System.out.println(solution42.solution(s));
    }
}

