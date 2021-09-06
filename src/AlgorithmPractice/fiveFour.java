package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

public class fiveFour {

    public int solution(String str) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-48);
            }
            else {
                int rt=stack.pop();
                int lt=stack.pop();
                if (x=='+') stack.push(lt+rt);
                else if (x=='-') stack.push(lt-rt);
                else if (x=='*') stack.push(lt*rt);
                else if (x=='/') stack.push(lt/rt);
            }
        }
        answer=stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        fiveFour T = new fiveFour();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
