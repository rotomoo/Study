package InflearnAlgorithm;

import java.util.Scanner;

class tenOne {
    static int[] fibo;
    public int solution(int n) {
        fibo[1]=1;
        fibo[2]=2;
        for (int i=3;i<=n;i++) {
            fibo[i]=fibo[i-2]+fibo[i-1];
        }
        return fibo[n];
    }

    public static void main(String[] args) {
        tenOne T = new tenOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo = new int[n+1];
        System.out.print(T.solution(n));
    }
}
