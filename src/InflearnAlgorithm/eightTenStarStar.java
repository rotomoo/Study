package InflearnAlgorithm;

import java.util.Scanner;

public class eightTenStarStar {
    static int answer = 0;
    static int[] dx ={-1,0,1,0};
    static int[] dy ={0,1,0,-1};
    static int[][] arr;

    public void DFS(int x,int y) {
        if (x==7 && y==7) answer++;
        else {
            for (int i=0; i<4; i++) {
                int nx= x+dx[i];
                int ny= y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && arr[nx][ny]==0) {
                    arr[nx][ny]=1;
                    DFS(nx,ny);
                    arr[nx][ny]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightTenStarStar T = new eightTenStarStar();
        Scanner scanner = new Scanner(System.in);
        arr = new int[8][8];
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        arr[1][1]=1;
        T.DFS(1,1);
        System.out.print(answer);
    }
}