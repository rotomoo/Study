package AlgorithmPractice;

import java.util.Arrays;
import java.util.Scanner;

class tenFiveStarStar {
    static int[] dy;
    public int solution(int n, int[] arr, int m ) {
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0]=0;
        for (int i=0; i<n; i++) {
            for (int j=arr[i];j<=m; j++) {
                dy[j]=Math.min(dy[j],dy[j-arr[i]]+1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        tenFiveStarStar T = new tenFiveStarStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        dy = new int[m+1];
        System.out.println(T.solution(n, arr, m));
    }
}
