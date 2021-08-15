import java.util.Arrays;

//정수 내림차순으로 배치하기
class Solution16 {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        StringBuilder reverse = new StringBuilder();

        Arrays.sort(arr);

        for (int i = arr.length -1; i >= 0; i--) {
            reverse.append(arr[i]);
        }

        answer = Long.parseLong(reverse.toString());

        return answer;

/*
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        String reverse = "";
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        for(int i = 0; i < arrayList.toArray().length; i++){
            reverse += arrayList.get(i);
        }

        answer = Long.parseLong(reverse);

        return answer;

*/
    }

    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int n = 118372;

        System.out.println(solution16.solution(n));
    }
}

