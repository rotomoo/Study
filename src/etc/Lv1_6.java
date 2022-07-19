package etc;

import java.math.BigInteger;

class Lv1_6 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        BigInteger a = new BigInteger(String.valueOf(n));
        BigInteger b = new BigInteger(String.valueOf(m));
        answer[0] = a.gcd(b).intValue();
        answer[1] = n * m / answer[0];
        return answer;
    }
}