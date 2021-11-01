package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dy10844StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dy=new long[n+1][10];
        for (int i=1; i<=9; i++) dy[1][i]=1;
        for (int i=2; i<=n; i++) {
            for (int j=0; j<=9;j++) {
                if (j==0) dy[i][j]=dy[i-1][j+1];
                else if (j==9) dy[i][j]=dy[i-1][j-1];
                else dy[i][j]=(dy[i-1][j-1]+dy[i-1][j+1])%1000000000;
            }
        }
        long sum=0, answer=0;
        for (int i=0;i<=9;i++) sum+=dy[n][i];
        answer=sum%1000000000;
        System.out.print(answer);
    }
}
