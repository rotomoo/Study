package AlgorithmPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point17{
    int x,y;
    Point17(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class eightElevenStarStar {
    static int[] dx ={-1,0,1,0};
    static int[] dy ={0,1,0,-1};
    static int[][] arr, dis;

    public void BFS(int x, int y) {
        Queue<Point17> q= new LinkedList<>();
        q.offer(new Point17(x,y));
        arr[x][y]=1;
        while (!q.isEmpty()) {
            Point17 o=q.poll();
            for (int i=0; i<4; i++) {
                int nx= o.x+dx[i];
                int ny= o.y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && arr[nx][ny]==0) {
                    arr[nx][ny]=1;
                    q.offer(new Point17(nx, ny));
                    dis[nx][ny]=dis[o.x][o.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightElevenStarStar T = new eightElevenStarStar();
        Scanner scanner = new Scanner(System.in);
        arr = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        T.BFS(1,1);
        if (dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}