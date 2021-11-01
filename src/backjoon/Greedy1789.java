package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum =0, tmp=0;
        while (sum<=s) {
            if (sum==s) {
                System.out.print(tmp);
                return;
            }
            sum+=++tmp;
        }
        System.out.print(tmp-1);
    }
}
