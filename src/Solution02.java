// 프로그래머스 약수의 개수와 덧셈
class Solution02 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        long n_price = 0;

        for (int i = 1; i <= count; i ++){
            n_price += i * price;
            sum = n_price;
        }

        if(money <= sum){
            answer = sum - money;
        }else{
            return 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution02 short_money = new Solution02();
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(short_money.solution(price, money, count));
    }
}

