package InflearnAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

class tenFive {
    static int n, m;
    static int[] dy;
    public int solution(int[] coin) {
        Arrays.fill(dy, 2000000000);
        dy[0]=0;
        for (int i=0; i<n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        for (int x : dy) {
            System.out.print(x+" ");
        }
        return dy[m];
    }

    public static void main(String[] args) {
        tenFive T = new tenFive();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] coin = new int[n];
        for (int i=0; i<n; i++) {
            coin[i]=scanner.nextInt();
        }
        m = scanner.nextInt();
        dy = new int[m+1];
        System.out.print(T.solution(coin));
    }
}
