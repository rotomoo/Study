package InflearnAlgorithm;

import java.util.Scanner;

public class eightTwoRetry {
    static int n,c,answer=0;
    static int[] arr;

    public void DFS(int L, int sum) {
        if (sum>c) return;
        if (L==n) {
            answer=Math.max(answer,sum);
        }
        else{
            DFS(L+1,sum+arr[L]);
            DFS(L+1,sum);
        }
    }

    public static void main(String[] args) {
        eightTwoRetry T = new eightTwoRetry();
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        T.DFS(0,0);
        System.out.println(answer);
    }
}