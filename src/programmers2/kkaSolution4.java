package programmers2;

import java.math.BigInteger;

class kkaSolution4 {
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];

        int idx = 0;
        for (long number : numbers) {
            System.out.println(new BigInteger(String.valueOf(number)).toString(2));
            idx++;
        }
        return answer;
    }
}