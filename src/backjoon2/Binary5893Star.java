package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Binary5893Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine(), 2);
        System.out.println(a.multiply(new BigInteger("17")).toString(2));
    }
}
