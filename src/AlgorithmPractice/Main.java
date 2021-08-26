package AlgorithmPractice;

import java.util.Scanner;

public class Main {
    static int n, r;
    static int[][] arr;

    public int DFS(int n,int r) {
        if (arr[n][r]>0) return arr[n][r];
        if (n==r || r==0) return 1;
        else return arr[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        arr= new int[35][35];
        System.out.print(T.DFS(n,r));
    }
}
