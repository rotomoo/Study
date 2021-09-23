package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point3 {
    public int x,y;

    Point3 (int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class eightTwelve {
    static int[][] arr, dis;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int w, h;
    static Queue<Point3> queue=new LinkedList<>();

    public void BFS() {
        while (!queue.isEmpty()) {
            Point3 tmp = queue.poll();
            for (int i=0; i<4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx>=0 && nx<w && ny>=0 && ny<h && arr[nx][ny]==0) {
                    arr[nx][ny]=1;
                    queue.offer(new Point3(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightTwelve T = new eightTwelve();
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        w = scanner.nextInt();
        arr= new int[w][h];
        dis= new int[w][h];
        for (int i=0; i<w; i++) {
            for (int j=0; j<h; j++) {
                arr[i][j]= scanner.nextInt();
                if (arr[i][j]==1) queue.offer(new Point3(i,j));
            }
        }
        T.BFS();
        boolean flag=true;
        int answer=Integer.MIN_VALUE;
        for (int i=0; i<w; i++) {
            for (int j=0; j<h; j++) {
                if (arr[i][j]==0) flag=false;
            }
        }
        if (flag) {
            for (int i=0; i<w; i++) {
                for (int j=0; j<h; j++) {
                    answer=Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}
