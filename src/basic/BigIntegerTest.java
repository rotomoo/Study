package basic;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("12235235235325253523523523523523523534");
        BigInteger b = new BigInteger("123");
        System.out.println(a.remainder(b));
    }
}
