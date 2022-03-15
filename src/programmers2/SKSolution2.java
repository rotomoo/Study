package programmers2;

import java.util.LinkedList;
import java.util.Queue;

class SKSolution2 {
    static class Point {
        int x, y, direcIndex;

        public Point(int x, int y, int direcIndex) {
            this.x = x;
            this.y = y;
            this.direcIndex = direcIndex;
        }
    }
    static int N;
    static boolean Run;
    static int[][] graph = new int[N][N];

    public static boolean isCheck(int[][] graph) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j]==0) return false;
            }
        }
        return true;
    }


    public static void BFS() {
        int[] dx = Run == true ? new int[]{0, 1, 0, -1} : new int[]{1, 0, -1, 0};
        int[] dy = Run == true ? new int[]{1, 0, -1, 0} : new int[]{0, 1, 0, -1};
        Queue<Point> q = new LinkedList<>();
        if (Run == true) {
            q.offer(new Point(0, 0, 0));
            q.offer(new Point(0, N-1, 1));
            q.offer(new Point(N-1, N-1, 2));
            q.offer(new Point(N-1, 0, 3));
        }
        else {
            q.offer(new Point(0, 0, 0));
            q.offer(new Point(N - 1, 0, 1));
            q.offer(new Point(N - 1, N - 1, 2));
            q.offer(new Point(0, N - 1, 3));
        }
        graph[0][0] = 1;
        graph[0][N-1] = 1;
        graph[N-1][0] = 1;
        graph[N-1][N-1] = 1;
        int val = 2;
        boolean flag = false;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point tmp = q.poll();
                int nx = tmp.x + dx[tmp.direcIndex];
                int ny = tmp.y + dy[tmp.direcIndex];
                if (graph[nx][ny]==0) {
                    graph[nx][ny] = val;
                }
                else {
                    flag = true;
                    nx = tmp.x;
                    ny = tmp.y;
                    tmp.direcIndex++;
                }
                tmp.direcIndex = tmp.direcIndex == 4 ? 0 : tmp.direcIndex;
                q.offer(new Point(nx, ny, tmp.direcIndex));
            }
            if (flag) {
                val--;
                flag = false;
            }
            if (isCheck(graph)) break;
            val++;
        }
    }

    public static int[][] solution(boolean run, int n) {
        Run = run;
        N = n;
        graph = new int[n][n];
        BFS();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        return graph;
    }

    public static void main(String[] args) {
        boolean run = true;
        int n = 5;
        System.out.println(solution(run, n));
    }
}
