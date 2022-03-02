package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dy2579StarStar {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for (int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        dp[1] = arr[1];
        if(n==1) {
            System.out.print(dp[1]);
            System.exit(0);
        }
        dp[2] = arr[1]+arr[2];
        for (int i=3; i<=n; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i];
        }
        System.out.print(dp[n]);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n+1];
//        int[] dy = new int[n+1];
//        for (int i=1; i<=n;i++) {
//            arr[i]=Integer.parseInt(br.readLine());
//        }
//        dy[1]=arr[1];
//        if (n>1) dy[2]=arr[1]+arr[2];
//        for (int i=3; i<=n; i++) dy[i]=Math.max(dy[i-2]+arr[i],dy[i-3]+arr[i-1]+arr[i]);
//        System.out.println(dy[n]);
//    }
}
