package InflearnAlgorithm;

import java.util.Scanner;

public class eightFourStarStar {
    static int n, m;
    static int[] arr;
    public void DFS(int L) {
        if (L==m) {
            for (int x : arr) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=1; i<=n; i++) {
                arr[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        eightFourStarStar T = new eightFourStarStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr =new int[m];
        T.DFS(0);
    }
}
