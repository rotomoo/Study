package programmers;

import java.util.ArrayList;

class TriangularSnail {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[][] dy = new int[n][n];
        int x = -1;
        int y = 0;
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i%3==0) x++;
                else if (i%3==1) y++;
                else {
                    x--;
                    y--;
                }
                dy[x][y] = val++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dy[i][j]==0) break;
                answer.add(dy[i][j]);
            }
        }
        return answer;
    }
}