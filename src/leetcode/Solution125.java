package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution125 {
    public boolean isPalindrome(String s) {
        Deque dq = new ArrayDeque();
        s = s.toLowerCase();
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x) || Character.isDigit(x)) {
                dq.push(x);
            }
        }

        while (dq.size() > 1) {
            if (!dq.pollFirst().equals(dq.pollLast())) {
                return false;
            }
        }
        return true;
    }

//    public static boolean isPalindrome(String s) {
//        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
//        for(int i=0; i<s.length()/2; i++) {
//            if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
//        }
//        return true;
//    }
}
