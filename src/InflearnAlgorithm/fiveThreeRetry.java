package InflearnAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class fiveThreeRetry {
    public int solution(int n, int m, int[][] arr, int[] arr2) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
            for (int cnt=1; cnt<=m; cnt++) {
                int tmp=arr2[cnt];
                for (int j=1; j<=n; j++) {
                    if (arr[j][tmp]!=0) {
                        stack.push(arr[j][tmp]);
                        arr[j][tmp]=0;
                        break;
                    }
                }
                if (stack.size()>1) {
                    int x = stack.pop();
                    int y = stack.pop();
                    if (x==y) answer=answer+2;
                    else{
                        stack.push(y);
                        stack.push(x);
                    }
                }
            }
        return answer;
    }

    public static void main(String[] args) {
        fiveThreeRetry T = new fiveThreeRetry();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m+1];
        for (int i = 1; i <= m; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, m, arr, arr2));
    }
}