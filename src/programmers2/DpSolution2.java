package programmers2;

import java.util.Arrays;

class DpSolution2 {
    public static int solution(int alp, int cop, int[][] problems) {
        Arrays.sort(problems, (o1, o2) -> {
            int[] a = o1;
            int[] b = o2;
            if (a[0]==b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });

        int maxAlp = 0;
        int maxCop = 0;

        // 추가 배열
        int maxAlpP = 0;
        int maxCopP = 0;

        // max 선정
        for (int i = 0; i < problems.length; i++) {
            maxAlp = Integer.max(maxAlp, problems[i][0]);
            maxCop = Integer.max(maxCop, problems[i][1]);
            maxAlpP = Integer.max(maxAlpP, problems[i][2]);
            maxCopP = Integer.max(maxCopP, problems[i][3]);
        }

        // dp 설정
        int[][] dp = new int[maxAlp + maxAlpP +1][maxCop + maxCopP + 1];

        // 초기 dp 그리기
        for (int i = alp; i <= maxAlp + maxAlpP; i++) {
            for (int j = cop; j <= maxCop + maxCopP; j++) {
                dp[i][j] = i - alp + j - cop;
            }
        }

        // dp 값 변경
        for (int[] problem : problems) {
            // 문제풀기
            for (int i = problem[0] + problem[2]; i <= maxAlp + maxAlpP; i++) {
                for (int j = problem[1] + problem[3]; j <= maxCop + maxCopP; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - problem[2]][j - problem[3]] + problem[4]);
                    dp[i][j] = Math.min(dp[i][j], Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                }
            }
        }
        return dp[maxAlp][maxCop];
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 10, new int[][]{{0,0,2,1,2}, {}}));
    }
}