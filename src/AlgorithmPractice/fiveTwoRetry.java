package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

class fiveTwoRetry {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x=='(') stack.push(x);
            if (x==')') stack.pop();
            if (stack.isEmpty() && x!=')') answer+=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveTwoRetry T = new fiveTwoRetry();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}