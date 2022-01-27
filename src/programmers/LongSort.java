package programmers;

import java.util.Arrays;

class LongSort {
    public long solution(long n) {
        long answer = 0;
        char[] str = String.valueOf(n).toCharArray();
        Arrays.sort(str);
        answer += Long.parseLong(new StringBuilder(new String(str)).reverse().toString());
        return answer;
    }
}
