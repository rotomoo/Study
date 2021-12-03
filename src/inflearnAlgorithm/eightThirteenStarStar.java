package InflearnAlgorithm;

import java.util.Scanner;

class eightThirteenStarStar {
    static int[][] arr;
    static int n, answer = 0;
    static int[] dx ={-1,-1,0,1,1,1,0,-1};
    static int[] dy ={0,1,1,1,0,-1,-1,-1};

    public void DFS(int x, int y) {
        for (int i=0; i<8; i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]==1) {
                arr[nx][ny]=0;
                DFS(nx,ny);
            }
        }
    }

    public void solution() {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (arr[i][j]==1) {
                    answer++;
                    arr[i][j]=0;
                    DFS(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        eightThirteenStarStar T = new eightThirteenStarStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        T.solution();
        System.out.println(answer);
    }
}
