import java.util.HashMap;

// 프로그래머스 완주하지 못한 선수
class Solution44 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String i: participant) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (String j: completion) {
            hashMap.put(j, hashMap.get(j) - 1);
        }
        for (String key: hashMap.keySet()) {
            if(hashMap.get(key) != 0){
                answer = key;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution44 solution44 = new Solution44();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution44.solution(participant, completion));
    }
}

