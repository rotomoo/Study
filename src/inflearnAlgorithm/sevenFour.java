package InflearnAlgorithm;

import java.util.Scanner;

//(중요)재귀함수보다 for문이 성능이 좋다. 스택프레임이기 때문에
class sevenFour {
    static int[] fibo;

    public int DFS(int n) {
        if (fibo[n]>0) return fibo[n];
        if (n==1) return fibo[n]=1;
        else if (n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args) {
        sevenFour T = new sevenFour();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo=new int[n+1];
        T.DFS(n);
        for (int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}
