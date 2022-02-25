package programmers;

import java.util.Stack;

class MakeBigNumber {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char x : number.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() < x && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(x);
        }
        for (; k > 0; k--) stack.pop();
        for (char x : stack) answer.append(x);
        return answer.toString();
    }
}

/*
import java.io.IOException;

public class Greedy3 {

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int[] arr = new int[number.length()];
        int[] tmp = new int[number.length()-k];
        for (int i=0; i<number.length(); i++) {
            arr[i]=number.charAt(i)-'0';
        }
        int index=0;
        for(int i=0; i<tmp.length; i++) {
            int max=Integer.MIN_VALUE;
            for (int j=index; j<=k+i; j++) {
                System.out.println("i="+i+" j="+j);
                if (arr[j]>max) {
                    max=arr[j];
                    index=j+1;
                }
            }
            tmp[i]=max;
        }
        for (int x : tmp) answer.append(x);
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        String number ="4177252841";
        int k=4;
        System.out.println(solution(number,k));
    }
}
*/
