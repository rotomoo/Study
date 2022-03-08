package programmers;

import java.util.LinkedList;
import java.util.Queue;

class NMok {
    static class Point {
        int x;
        int y;
        int len;
        int direction;

        public Point(int x, int y, int len, int direction) {
            this.x = x;
            this.y = y;
            this.len = len;
            this.direction = direction;
        }
    }


    static int N, Row, Col, answer;
    static int[][] graph;
    static int[] dx = {0, 1, 1, 1};
    static int[] dy = {1, 1, 0, -1};

    public static boolean isCheck(int x, int y, int direction){
        System.out.println(x+" "+y+" "+direction);
        int nx = x + dx[direction];
        int ny = y + dy[direction];
        int cx = x + dx[direction] * -N;
        int cy = y + dy[direction] * -N;
        System.out.println("cx = " + cx);
        System.out.println("cy = " + cy);
        if (isIn(nx, ny) && graph[nx][ny]==1) return false;
        if (isIn(cx, cy) && graph[cx][cy]==1) return false;
        return true;
    }

    public static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 1, 0));
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            if (tmp.len==1) {
                for (int i=0; i<4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (isIn(nx, ny) && graph[nx][ny] == 1) {
                        q.offer(new Point(nx, ny, tmp.len + 1, i));
                    }
                }
            }
            else if (tmp.len < N){
                int nx = tmp.x + dx[tmp.direction];
                int ny = tmp.y + dy[tmp.direction];
                if (isIn(nx, ny) && graph[nx][ny] == 1) {
                    q.offer(new Point(nx, ny, tmp.len + 1, tmp.direction));
                }
            }
            else {
                if (isCheck(tmp.x, tmp.y, tmp.direction)) answer++;
            }
        }
    }


    public static int solution(int row, int col, int n, String[] arr) {
        answer = 0;
        N = n;
        Row = row;
        Col = col;
        graph = new int[row][col];
        for (int i = 0; i < row; i++) {
            String tmp = arr[i];
            for (int j = 0; j < col; j++) {
                graph[i][j] = tmp.charAt(j) - '0';
            }
        }
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (graph[i][j]==1) {
                    BFS(i, j);
                }
            }
        }
        return answer;
    }

    public static boolean isIn(int nx, int ny) {
        if (nx >= 0 && ny >= 0 && nx < Row && ny < Col) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,3};
        System.out.println(solution(5,5,4, new String[]{"11110","00111","11101","11011","11111"}));
    }
}
