package programmers2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class NaSolution2 {
    static class Point {
        char[][] map;
        int x, y;

        public Point(char[][] map, int x, int y) {
            this.map = map;
            this.x = x;
            this.y = y;
        }
    }

    static char[][] map;
    static HashSet<Point> set;
    static int answer = Integer.MIN_VALUE;

    public static int calcX(char[][] map) {
        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]=='X') cnt++;
            }
        }
        return cnt;
    }

    public static char[][] copyMap(char[][] map) {
        char[][] cloneMap = new char[map.length][map[0].length];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                cloneMap[i][j] = map[i][j];
            }
        }
        return cloneMap;
    }

    public static void BFS(int len) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(map, 0, 0));
        q.offer(new Point(map, 1, 0));
        set.add(new Point(map, 0, 0));
        set.add(new Point(map, 1, 0));
        while (!q.isEmpty()) {
            Point poll = q.poll();
            if (poll.y == len-1) {
                answer = Math.max(answer, calcX(poll.map));
                continue;
            }
            if (!set.contains(poll)) {
                if (poll.map[poll.x][poll.y+1] == 'X') {
                    char[][] cloneMap = copyMap(poll.map);
                    if (poll.x==0) {
                        cloneMap[poll.x + 1][poll.y] = '.';
                        set.add(new Point(cloneMap, poll.x+1, poll.y));
                        q.offer(new Point(cloneMap, poll.x+1, poll.y));
                    }
                    else {
                        cloneMap[poll.x - 1][poll.y] = '.';
                        set.add(new Point(cloneMap, poll.x-1, poll.y));
                        q.offer(new Point(cloneMap, poll.x-1, poll.y));
                    }
                }
                char[][] cloneMap = copyMap(poll.map);
                cloneMap[poll.x][poll.y + 1] = '.';
                set.add(new Point(cloneMap, poll.x, poll.y + 1));
                q.offer(new Point(cloneMap, poll.x, poll.y + 1));
            }
        }
    }

    public static int solution(String L1, String L2) {
        // write your code in Java SE 11
        map = new char[2][L1.length()];
        set = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < L1.length(); j++) {
                if (i==0) map[i][j] = L1.charAt(j);
                else if (i==1) map[i][j] = L2.charAt(j);
            }
        }
        BFS(L1.length());
        return answer;
    }
}
