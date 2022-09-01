package programmers;

import java.util.Stack;

class TSolution1 {

    static int answer;
    static boolean needPop;


    public static void isFullStack(Stack<Integer> stack) {
        if (stack.size()==3) {
            answer = Math.max(Integer.parseInt(String.valueOf(stack.pop()).repeat(3)), answer);
            needPop = true;
        }
    }

    public static int solution(String s) {
        answer = -1;
        Stack<Integer> stack = new Stack<>();
        needPop = false;

        for (char x: s.toCharArray()) {
            if (stack.size()==3) {
                isFullStack(stack);
            }
            if (!stack.isEmpty() && stack.peek() != x - '0') {
                needPop = true;
            }
            if (needPop) {
                while (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            needPop = false;
            stack.push(x - '0');
        }
        if (stack.size()==3) {
            isFullStack(stack);
        }
        return answer;
    }
}