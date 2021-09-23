package InflearnAlgorithm;

import java.util.Scanner;

public class eightEight {
    static int n, m;
    static int[] a, b, ch;
    boolean flag=false;
    int[][] arr = new int[35][35];

    public int combi(int n, int r) {
        if(arr[n][r]>0) return arr[n][r];
        if (n==r || r==0) return 1;
        else return arr[n][r]=combi(n-1, r-1)+combi(n-1,r);
    }

    public void DFS(int L,int sum) {
        if (flag) return;
        if (L==n) {
            if (sum==m) {
                for (int x : a) System.out.print(x+" ");
                flag = true;
            }
        }
        else {
            for (int i=1; i<=n; i++){
                if (ch[i]==0) {
                    ch[i] = 1;
                    a[L]=i;
                    DFS(L + 1, sum+(a[L]*b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightEight T = new eightEight();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n];
        b = new int[n];
        ch = new int[n+1];
        for (int i=0; i<n;i++) {
            b[i]=T.combi(n-1, i);
        }
        T.DFS(0,0);
    }
}
