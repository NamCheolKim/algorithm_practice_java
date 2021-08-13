// 프로그래머스 상호평가
class Solution08 {
    public String solution(int[][] scores) {
        String answer = "";

        for(int j = 0; j < scores.length; j++){
            int MyScore = scores[j][j]; // 자기 자신이 평가한 자신의 점수
            double TotalScore = 0; // 자신의 총 점수
            boolean HighScore = true;
            boolean LowScore = true;
            boolean SameScore = false;

            for(int i = 0; i < scores.length; i++){
                TotalScore += scores[i][j]; // 자신의 점수를 모두 더하여 총점수를 만든다.

                if(MyScore > scores[i][j]){ // 자신이 평가한 점수가 자신의 점수들 중 최고점이라면
                    HighScore = false;
                }
                if(MyScore < scores[i][j]){ // 자신이 평가한 점수가 자신의 점수들 중 최저점이라면
                    LowScore = false;
                }
                if(i != j && MyScore == scores[i][j]){ // 자신이 평가한 점수와 동일한 점수가 있다면
                    SameScore = true;
                }
            }

            int cnt = scores.length;
            if (!SameScore && (HighScore || LowScore)){ // 자신의 점수가 동일한 점수가 없고, 자신이 평가한 점수가 최고점 또는 최저점이라면
                TotalScore -= MyScore; // 총점수 중 자신이 평가한 점수를 제외하고 평균을 구한다.
                cnt--;
            }

            answer += scoreRank(TotalScore / cnt);
        }

        return answer;
    }

    public char scoreRank(double score){
        if(score >= 90){
            return 'A';
        }
        if(score >= 80){
            return 'B';
        }
        if(score >= 70){
            return 'C';
        }
        if(score >= 50){
            return 'D';
        }

        return 'F';
    }

    public static void main(String[] args) {
        Solution08 solution08 = new Solution08();
        int[][] scores = {{100,90,98,88,65}, {50,45,99,85,77}, {47,88,95,80,67}, {61,57,100,80,65}, {24,90,94,75,65}};

        System.out.println(solution08.solution(scores));
    }
}
