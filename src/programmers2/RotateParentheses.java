package programmers2;

import java.util.HashMap;
import java.util.Stack;

class RotateParentheses {

    public static boolean isCheck(String str) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (char x : str.toCharArray()) {
            if (!map.containsKey(x)) {
                stack.push(x);
            }
            else if (stack.isEmpty() || map.get(x) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String tmp = s.substring(i, len) + s.substring(0, i);
            if (isCheck(tmp)) answer++;
        }
        return answer;
    }
}