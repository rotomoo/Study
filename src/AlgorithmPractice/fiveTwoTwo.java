package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

public class fiveTwoTwo {

    public String solution(String str) {
        String answer="";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x != ')') stack.push(x);
            else if (x == ')') {
                while (stack.pop() != '(') ;
            }
        }
        for (char x : stack){
            answer+=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveTwoTwo T = new fiveTwoTwo();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
