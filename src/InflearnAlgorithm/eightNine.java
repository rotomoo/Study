package InflearnAlgorithm;

import java.util.Scanner;

public class eightNine {
    static int n,m;
    static int[] tmp;

    public void DFS(int L, int s) {
        if (L==m) {
            for (int x : tmp) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=s; i<=n; i++) {
                tmp[L]=i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        eightNine T = new eightNine();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        tmp= new int[m];
        T.DFS(0,1);
    }
}
