package programmers;

import java.math.BigInteger;

class NextBigNumber {

    public long count(String tmp) {
        return tmp.chars().filter(c -> c == '1').count();
    }

    public String binarySearch(int v) {
        return new BigInteger(String.valueOf(v)).toString(2);
    }

    public int solution(int n) {
        int answer = 0;
        long nCnt = count(binarySearch(n));
        for (int i = n+1; i <= 1000000; i++) {
            if (nCnt == count(binarySearch(i))) {
                return i;
            }
        }
        return answer;
    }


//    public long count(String tmp) {
//        int cnt = 0;
//        for (char x : tmp.toCharArray()) {
//            if (x == '1') cnt++;
//        }
//        return cnt;
//    }
//
//    public int solution(int n) {
//        int answer = 0;
//        long nCnt = count(Integer.toBinaryString(n));
//        for (int i = n+1; i <= 1000000; i++) {
//            if (nCnt == count(Integer.toBinaryString(i))) {
//                return i;
//            }
//        }
//        return answer;
//    }
}