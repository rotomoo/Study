package programmers;

class EatGround {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dy = new int[land.length][land[0].length];
        for (int i = 0; i < land[0].length; i++) {
            dy[0][i] = land[0][i];
        }

        for (int i = 1; i < land.length; i++) {
            dy[i][0] = land[i][0] + Math.max(dy[i - 1][1], Math.max(dy[i - 1][2], dy[i - 1][3]));
            dy[i][1] = land[i][1] + Math.max(dy[i - 1][0], Math.max(dy[i - 1][2], dy[i - 1][3]));
            dy[i][2] = land[i][2] + Math.max(dy[i - 1][0], Math.max(dy[i - 1][1], dy[i - 1][3]));
            dy[i][3] = land[i][3] + Math.max(dy[i - 1][0], Math.max(dy[i - 1][1], dy[i - 1][2]));
        }

        for (int i = 0; i < land[0].length; i++) {
            answer = Math.max(answer, dy[land.length - 1][i]);
        }

        return answer;
    }

//    int solution(int[][] land) {
//        int answer = 0;
//        int[][] dy = new int[land.length][land[0].length];
//        for (int i = 0; i < land[0].length; i++) {
//            dy[0][i] = land[0][i];
//        }
//        for (int i = 1; i < land.length; i++) {
//            for (int j = 0; j < land[0].length; j++) {
//                dy[i][j] = land[i][j];
//                int max = Integer.MIN_VALUE;
//                for (int k = 0; k < land[0].length; k++) {
//                    if (j==k) continue;
//                    max = Math.max(max, dy[i-1][k]);
//                }
//                dy[i][j] += max;
//            }
//        }
//
//        for (int i = 0; i < land[0].length; i++) {
//            answer = Math.max(answer, dy[land.length - 1][i]);
//        }
//
//        return answer;
//    }
}