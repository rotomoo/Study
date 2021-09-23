package InflearnAlgorithm;

import java.util.Scanner;

class tenSixBestStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] dy= new int[m+1];
        for (int i=0; i<n; i++) {
            int ps=scanner.nextInt();
            int pt=scanner.nextInt();
            for (int j=m; j>=pt; j--) {
                dy[j] = Math.max(dy[j], dy[j-pt]+ps);
            }
        }
        System.out.print(dy[m]);
    }
}