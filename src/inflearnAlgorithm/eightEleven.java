package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    public int x,y;

    Point2(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class eightEleven {

    static int[] dx={-1,0,1,0};
    static int[] dy={-0,1,0,-1};
    static int[][] arr, dis;

    public void BFS(int x, int y) {
        Queue<Point2> queue = new LinkedList<>();
        queue.offer(new Point2(x, y));
        arr[x][y]=1;
        while (!queue.isEmpty()) {
            Point2 tmp =queue.poll();
            for (int i=0; i<4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && arr[nx][ny]==0) {
                    arr[nx][ny]=1;
                    queue.offer(new Point2(nx,ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightEleven T = new eightEleven();
        Scanner scanner = new Scanner(System.in);
        arr = new int[8][8];
        dis = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        T.BFS(1,1);
        if (dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
