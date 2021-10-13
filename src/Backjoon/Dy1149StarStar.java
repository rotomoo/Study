package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dy1149StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[][] dy = new int[n+1][3];
        for (int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dy[i][0] = Integer.parseInt(st.nextToken());
            dy[i][1] = Integer.parseInt(st.nextToken());
            dy[i][2] = Integer.parseInt(st.nextToken());
        }
        for (int i=2;i<=n;i++) {
            dy[i][0]+=Math.min(dy[i-1][1],dy[i-1][2]);
            dy[i][1]+=Math.min(dy[i-1][0],dy[i-1][2]);
            dy[i][2]+=Math.min(dy[i-1][0],dy[i-1][1]);
        }
        System.out.print(Math.min(dy[n][0],Math.min(dy[n][1],dy[n][2])));
    }
}
