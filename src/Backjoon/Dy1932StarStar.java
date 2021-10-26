package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dy1932StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dy = new int[n][n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<=i; j++) {
                dy[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j==0) dy[i][j]+=dy[i-1][j];
                else if (j==i) dy[i][j]+=dy[i-1][j-1];
                else dy[i][j]+=Math.max(dy[i-1][j-1],dy[i-1][j]);
            }
        }
        int answer=Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            answer=Math.max(answer,dy[n-1][i]);
        }
        System.out.print(answer);
    }
}
