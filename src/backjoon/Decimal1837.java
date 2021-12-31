package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Decimal1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 2; i < k; i++) {
            if (n.mod(new BigInteger(String.valueOf(i))).toString().equals("0")) {
                System.out.println("BAD" + " " + i);
                System.exit(0);
            }
        }
        System.out.println("GOOD");
    }
}
