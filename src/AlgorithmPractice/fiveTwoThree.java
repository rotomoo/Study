package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

public class fiveTwoThree {

    public String solution(String str) {
        String answer="";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            }
            else {
                stack.push(x);
            }
        }
        for (int i=0;i<stack.size();i++) {
            answer+=stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveTwoThree T = new fiveTwoThree();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
