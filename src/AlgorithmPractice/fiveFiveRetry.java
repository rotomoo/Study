package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

class fiveFiveRetry {
    public int solution(String str) {
        int answer=0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='(') stack.push('(');
            if (str.charAt(i)==')'){
                if (str.charAt(i-1)==')') {
                    stack.pop();
                    answer++;
                } else if (stack.peek()=='(') {
                    stack.pop();
                    answer+=stack.size();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveFiveRetry T = new fiveFiveRetry();
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        System.out.print(T.solution(str));
    }
}