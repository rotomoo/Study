package programmers.Find_prime_kdecimal;

import java.math.BigInteger;

class roto3 {
    public static boolean findPrime(long v) {
        if (v==1) return false;
        for (int i = 2; i <=(int)Math.sqrt(v); i++) {
            if (v%i==0) return false;
        }
        return true;
    }

    public int solution(int n, int k) {
        int answer = 0;
        String tmp = new BigInteger(String.valueOf(n)).toString(k);
        String[] split = tmp.split("0");
        for (String x : split) {
            if (x.equals("")) continue;
            if (findPrime(Long.parseLong(x))) answer++;
        }
        return answer;
    }
}