package AlgorithmPractice;

import java.util.Scanner;

public class eightSeven {
    static int n, r;
    int[][] arr = new int[35][35];

    public int DFS(int n,int r) {
        if (arr[n][r]>0) return arr[n][r];
        if (n==r || r==0) return 1;
        else return arr[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) {
        eightSeven T = new eightSeven();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        System.out.print(T.DFS(n,r));
    }
}
