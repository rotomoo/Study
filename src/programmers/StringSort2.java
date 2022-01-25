package programmers;

import java.util.Arrays;

class StringSort2 {
    public String solution(String s) {
        char[] x = s.toCharArray();
        Arrays.sort(x);
        return new StringBuilder(new String(x)).reverse().toString();
    }
}
