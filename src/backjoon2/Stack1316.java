package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i=0; i<n; i++) {
            if (isCheck(br.readLine())) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static boolean isCheck(String s) {
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (!stack.contains(x)) {
                stack.push(x);
                continue;
            }
            else {
                if (stack.peek() != x) {
                    return false;
                }
            }
        }
        return true;
    }
}
