package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dy1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dy = new long[1000001];
        dy[1]=1;
        dy[2]=2;
        for (int i=3; i<=n; i++) {
            dy[i]=(dy[i-2]+dy[i-1])%15746;
        }
        System.out.print(dy[n]);
    }
}
