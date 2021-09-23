package InflearnAlgorithm;

import java.util.Scanner;

public class sevenThreeStar {
    public int DFS(int n) {
        if (n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        sevenThreeStar T = new sevenThreeStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(T.DFS(n));
    }
}