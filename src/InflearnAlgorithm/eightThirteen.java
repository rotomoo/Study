package InflearnAlgorithm;

import java.util.Scanner;

class eightThirteen {
    static int[] dx ={-1,-1,0,1,1,1,0,-1};
    static int[] dy ={0,1,1,1,0,-1,-1,-1};
    static int[][] arr, dis;
    static int answer=0, n;

    public void DFS(int x, int y) {
        for (int i=0; i<8; i++){
            int nx= x+dx[i];
            int ny= y+dy[i];
            if (nx>=0 && nx<n && ny >=0 && ny<n && arr[nx][ny]==1) {
                arr[nx][ny]=0;
                DFS(nx, ny);
            }
        }
    }

    public void solution(int[][] arr) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                if (arr[i][j]==1) {
                    answer++;
                    arr[i][j]=0;
                    DFS(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        eightThirteen T = new eightThirteen();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n][n];
        dis = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }
}
