package InflearnAlgorithm;

import java.util.Scanner;

public class sevenOneRetry {
    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        sevenOneRetry T = new sevenOneRetry();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        T.DFS(n);
    }
}