package AlgorithmPractice;

import java.util.Scanner;

class tenSixBest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] dy= new int[m+1];
        for (int i=0; i<n; i++) {
            int score=scanner.nextInt();
            int time=scanner.nextInt();
            for (int j=m; j>=time; j--) {
                dy[j] = Math.max(dy[j], dy[j-time]+score);
            }
        }
        System.out.print(dy[m]);
    }
}