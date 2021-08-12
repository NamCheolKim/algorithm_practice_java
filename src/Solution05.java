import java.util.HashSet;

// 프로그래머스 폰켓몬
class Solution05 {
    public int solution(int[] nums) {
        int answer = nums.length / 2; // N마리 중 N/2 마리를 가져 갈 수 있음.(N마리 중 가져갈 수 있는 종류의 최댓값.)
        HashSet<Integer> set = new HashSet<>(); // 중복되는 폰켓몬 제거

        for (int num:nums) {
            set.add(num);
        }

        if(set.size() > answer){ // 중복을 제거한 set의 size가 answer보다 크면 answer, 작으면 set의 size를 리턴.
            return answer;
        }else{
            return set.size();
        }
    }

    public static void main(String[] args) {
        Solution05 poketmon_kind = new Solution05();
        int n[] = {3, 1, 2, 3};

        System.out.println(poketmon_kind.solution(n));
    }
}

