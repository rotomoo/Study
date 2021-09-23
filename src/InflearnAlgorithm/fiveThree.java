package InflearnAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class fiveThree {
    public int solution(int n, int[][] arr, int[] arr2) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int pos: arr2) {
            for (int i=0;i<n;i++) {
                if (arr[i][pos-1]!=0) {
                    int tmp=arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if (!stack.isEmpty() && tmp==stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }
                    else {
                    stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveThree T = new fiveThree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int width=0;width<n;width++) {
            for (int height=0;height<n;height++) {
                arr[width][height] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int width=0;width<m;width++) {
            arr2[width] = scanner.nextInt();
        }
        System.out.print(T.solution(n,arr,arr2));
    }
}
