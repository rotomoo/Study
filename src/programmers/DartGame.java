package programmers;

import java.util.Stack;

class DartGame {
    public int solution(String dartResult) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<dartResult.length(); i++) {
            if (Character.isDigit(dartResult.charAt(i))) {
                if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                    stack.push(10);
                    i++;
                }
                else {
                    stack.push(dartResult.charAt(i) - '0');
                }
            }
            else {
                int tmp = stack.pop();
                if (dartResult.charAt(i) == 'S') stack.push(tmp);
                else if (dartResult.charAt(i) == 'D') stack.push(tmp*tmp);
                else if (dartResult.charAt(i) == 'T') stack.push(tmp*tmp*tmp);
                else if (dartResult.charAt(i) == '#') stack.push(-tmp);
                else if (dartResult.charAt(i) == '*') {
                    if (!stack.isEmpty()) stack.push(stack.pop() * 2);
                    stack.push(tmp * 2);
                }
            }
        }
        while (!stack.isEmpty()) answer += stack.pop();
        return answer;
    }
}
