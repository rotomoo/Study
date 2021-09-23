package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point18 {
    int x,y;
    Point18(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class eightTwelveStarStar {
    static int[] dx ={-1,0,1,0};
    static int[] dy ={0,1,0,-1};
    static int[][] arr, dis;
    static int m, n;
    Queue<Point18> q= new LinkedList<>();

    public void BFS() {
        while (!q.isEmpty()) {
            Point18 tmp= q.poll();
            for (int i=0; i<4; i++) {
                int nx=tmp.x + dx[i];
                int ny=tmp.y + dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny]==0) {
                    arr[nx][ny]=1;
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                    q.offer(new Point18(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        eightTwelveStarStar T = new eightTwelveStarStar();
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        arr = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j]==1) T.q.offer(new Point18(i,j));
            }
        }
        T.BFS();
        boolean flag=true;
        int answer=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==0) flag=false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer=Math.max(answer,dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}