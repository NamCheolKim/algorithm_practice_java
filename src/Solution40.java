// 프로그래머스 직업군 추천하기
class Solution40 {
    public String solution(String[] table, String[] languages, int[] preference) {
        String[] str = new String[table.length];
        int[] result = new int[table.length];

        for (int i = 0; i < table.length; i++) {
            String[] occupational_group = table[i].split(" ");
            str[i] = table[i].split(" ")[0];
            for (int j = 0; j < occupational_group.length; j++) {
                for (int k = 0; k < languages.length; k++) {
                    if(occupational_group[j].equals(languages[k])){
                        result[i] += (occupational_group.length - j) * preference[k];
                    }
                }
            }
        }

        int score = result[0];
        String answer = str[0];

        for (int i = 0; i < result.length; i++) {
            if(score <= result[i]){
                if(score == result[i] && answer.compareTo(str[i]) > 0){
                    answer = str[i];
                }else if(score < result[i]){
                    score = result[i];
                    answer = str[i];
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();

        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7,5,5};

        System.out.println(solution40.solution(table,languages, preference));
    }
}

