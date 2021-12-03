package programmers;

import java.math.BigInteger;

public class LcmOfN {
    public int solution(int[] arr) {
        int answer = arr[0];
        int tmp=arr[0];
        for (int i=1; i<arr.length; i++) {
            int x=BigInteger.valueOf(tmp).gcd(BigInteger.valueOf(arr[i])).intValue();
            tmp=x;
            System.out.println(tmp);
            answer*=arr[i]/x;
        }
        return answer;
    }

    public static void main(String[] args) {
        LcmOfN T = new LcmOfN();
        int[] priorities={60,48,40};
        System.out.println(T.solution(priorities));
    }
}
