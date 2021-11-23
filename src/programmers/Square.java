package programmers;

import java.math.BigInteger;

public class Square {
    public long solution(int w, int h) {
        long answer = (long)w*h-(w+h-BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue());
        return answer;
    }

    public static void main(String[] args) {
        Square T = new Square();
        int w=8;
        int h=12;
        System.out.println(T.solution(w,h));
    }
}
