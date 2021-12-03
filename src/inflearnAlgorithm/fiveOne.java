package InflearnAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class fiveOne {

    public String solution(String str) {
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x=='(') stack.push(x);
            if (x==')') {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        fiveOne T = new fiveOne();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
