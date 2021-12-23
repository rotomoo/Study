package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigInteger8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger answer = a.add(b).divide(new BigInteger("2"));
        System.out.println(answer);
        System.out.println(answer.subtract(b));
    }
}
