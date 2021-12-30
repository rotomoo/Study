package programmers;

import java.math.BigInteger;

class DecimalConversion {
    public int solution(int n) {
        StringBuilder tmp = new StringBuilder(new BigInteger(String.valueOf(n)).toString(3)).reverse();
        return Integer.parseInt(String.valueOf(tmp),3);
    }
}