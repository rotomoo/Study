package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

class fiveOneRetry {
    public String solution(String str) {
        String answer="YES";
        Stack<Character> stack =new Stack<>();
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
        fiveOneRetry T = new fiveOneRetry();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}