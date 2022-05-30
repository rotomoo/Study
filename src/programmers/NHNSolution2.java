package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class NHNSolution2 {
    static char[][] map;
    static int[] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS(int answerLen, int sx, int sy, int ex, int ey, String able) {
        int[][] ch = new int[map.length][map[0].length];
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(sx-1, sy-1));
        ch[sx-1][sy-1]=1;
        int cnt = 1;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point tmp = q.poll();
                if (tmp.x == ex-1 && tmp.y == ey-1) {
                    answer[answerLen] = cnt;
                }
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >=0 && ny >=0 && nx < map.length && ny < map[0].length) {
                        String cur = "" + map[nx][ny];
                        if (ch[nx][ny] == 0 && able.contains(cur)) {
                            ch[nx][ny]=1;
                            q.offer(new Point(nx, ny));
                        }
                    }
                }
            }
            cnt++;
        }
    }

    public static int[] solution(String[] maze, String[] queries) {
        map = new char[maze.length][maze[0].length()];
        answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length(); j++) {
                map[i][j] = maze[i].charAt(j);
            }
        }

        int answerLen = 0;
        for (String query : queries) {
            String[] queryArr = query.split(" ");
            BFS(answerLen, Integer.parseInt(queryArr[0]), Integer.parseInt(queryArr[1]),
                    Integer.parseInt(queryArr[2]), Integer.parseInt(queryArr[3]),queryArr[4]);
            answerLen++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"AAAAA", "AABBB", "CAEFG", "AAEFF"}, new String[]{"1 1 1 1 AF", "1 1 4 5 AF", "2 1 4 5 FAE", "1 5 4 5 ABF", "1 1 4 1 A"});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}