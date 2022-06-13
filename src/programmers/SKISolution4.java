package programmers;

import java.util.*;

class SKISolution4 {
    static class Point implements Comparable<Point> {
        int x, y, k, restCnt;

        public Point(int x, int y, int k, int restCnt) {
            this.x = x;
            this.y = y;
            this.k = k;
            this.restCnt = restCnt;
        }

        @Override
        public int compareTo(Point o) {
            if (this.restCnt == o.restCnt) return o.k - this.k;
            else return this.restCnt - o.restCnt;
        }
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static int answer;

    public static void BFS(int x, int y, int k, String[] grid) {
        PriorityQueue<Point> q = new PriorityQueue<>();
        q.offer(new Point(x, y, k, 0));
        while (!q.isEmpty()) {
            Point curPoint = q.poll();
            System.out.println(curPoint.x +" " +curPoint.y +" " + curPoint.k + " " + curPoint.restCnt);
            if (curPoint.x == grid.length-1 && curPoint.y == grid[0].length()-1) {
                answer = curPoint.restCnt;
                break;
            }
            if (curPoint.k == 0) continue;
            for (int i = 0; i < 4; i++) {
                int nx = curPoint.x + dx[i];
                int ny = curPoint.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length()) {
                    q.offer(new Point(nx, ny, curPoint.k-1, curPoint.restCnt));
                    if (map[nx][ny] == '.') {
                        q.offer(new Point(nx, ny, k, curPoint.restCnt+1));
                    }
                }
            }
        }
    }

    public static int solution(String[] grid, int k) {
        map = new char[grid.length][grid[0].length()];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                map[i][j] = grid[i].charAt(j);
            }
        }

        BFS(0, 0, k, grid);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"..FFF.", "###FFF", "###.FF"}, 4));
    }
}