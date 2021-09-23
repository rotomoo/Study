package InflearnAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class sixFourRetry {

    public int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];
        Stack<Integer> stack = new Stack<>();
        for (int i=1; i<=n; i++) {
            if (!stack.contains(arr[i])) {
                stack.push(arr[i]);
                if (stack.size()>s) stack.remove(0);
            }
            else {
                stack.removeElement(arr[i]);
                stack.push(arr[i]);
            }
        }
        for (int i=0; i<s; i++) answer[i]=stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        sixFourRetry T = new sixFourRetry();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(s, n, arr))
        System.out.print(x+" ");
    }
}