package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greedy2839Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[] dy = new int[5001];
        dy[3]=1;
        dy[5]=1;
        for (int i=6; i<=n; i++) {
            if (dy[i-3]!=0) dy[i]=dy[i-3]+1;
            if (i%3==0) dy[i]=dy[i-3]+1;
            if (i%5==0) dy[i]=dy[i-5]+1;
        }
        if (dy[n]==0) System.out.print(-1);
        else System.out.print(dy[n]);
    }
}
