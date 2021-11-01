package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brute2231Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = (int)(Math.log10(n)+1);
        int answer=Integer.MAX_VALUE;
        for (int i=0; i<=len*9; i++) {
            int tmp=n-i, tmp2=n-i, sum=0;
            for (int j=len-1; j>=0; j--) {
                sum+=tmp%10;
                tmp/=10;
            }
            sum+=tmp2;
            if (sum==n) answer=Math.min(answer,tmp2);
        }
        if (answer!=Integer.MAX_VALUE) System.out.print(answer);
        else System.out.print(0);
    }
}
