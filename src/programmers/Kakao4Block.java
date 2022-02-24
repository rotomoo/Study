package programmers;

import java.util.ArrayList;

class Kakao4Block {
    static boolean flag;
    static char[][] boardTmp;
    static int M, N, answer;
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void move() {
        for (int i = 0; i < N; i++) {
            String tmp = "";
            for (int j = 0; j < M; j++) {
                if (boardTmp[j][i]=='0') tmp = "0" + tmp;
                else tmp += boardTmp[j][i];
            }
//            System.out.println(tmp);
            for (int j = 0; j < M; j++) {
                char[] chars = tmp.toCharArray();
                boardTmp[j][i] = chars[j];
//                System.out.print(boardTmp[j][i]+" ");
            }
//            System.out.println();
        }
    }

    public static void removeCheck(ArrayList<Point> list) {
        for (Point p : list) {
            boardTmp[p.x][p.y] = '0';
            boardTmp[p.x + 1][p.y] = '0';
            boardTmp[p.x][p.y+1] = '0';
            boardTmp[p.x+1][p.y+1] = '0';
        }
    }

    public static boolean isCheck(int x, int y) {
        char tmp = boardTmp[x][y];
        for (int i = x; i < x+2; i++) {
            for (int j = y; j < y+2; j++) {
                if (i==x && j==y) continue;
                if (tmp != boardTmp[i][j]) return false;
            }
        }
        return true;
    }

    public int solution(int m, int n, String[] board) {
        flag = true;
        boardTmp = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boardTmp[i][j] = board[i].charAt(j);
            }
        }
        M = m;
        N = n;
        while (flag) {
            ArrayList<Point> list = new ArrayList<>();
            flag = false;
            for (int i = 0; i < m-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    if (boardTmp[i][j]=='0') continue;
                    if (isCheck(i, j)) {
                        flag = true;
                        list.add(new Point(i, j));
                    }
                }
            }
            if (!list.isEmpty()) {
                removeCheck(list);
                move();
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (boardTmp[i][j]=='0') answer++;
            }
        }
        return answer;
    }
}