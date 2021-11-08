package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution5 {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    static int[][] map;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static boolean check(int row, int columns) {
        for (int i=0; i<row; i++) {
            for (int j=0; j<columns; j++) {
                if (map[i][j]==0) return false;
            }
        }
        return true;
    }

    public static int[][] BFS(int row, int columns) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0));
        int L=1;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            map[tmp.x][tmp.y]=L;
            if (row==columns && L==row+columns) return map;
            else if (L+1>row*columns && check(row, columns)) return map;
            if (L%2!=0) {
                if (tmp.y+1==columns) {
                    q.offer(new Point(tmp.x,0));
                }
                else q.offer(new Point(tmp.x,tmp.y+1));
            }
            else {
                if (tmp.x+1==row) {
                    q.offer(new Point(0,tmp.y));
                }
                else q.offer(new Point(tmp.x+1,tmp.y));
            }
            L++;
        }
        return map;
    }

    public int[][] solution(int row, int columns) {
        int[][] answer = {};
        map = new int[row][columns];
        answer=BFS(row,columns);
        return answer;
    }

    public static void main(String[] args) {
        Solution5 T = new Solution5();
        int row =2;
        int columns=2;
        System.out.println(T.solution(row,columns));
    }
}
