package AlgorithmPractice;

import java.util.Scanner;

public class eightThree {
    static int n, m, answer;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time>m) return;
        if (L==n) {
            answer=Math.max(answer,sum);
        }
        else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        eightThree T = new eightThree();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for (int i=0; i<n; i++) {
                arr[i] = scanner.nextInt();
                arr2[i] = scanner.nextInt();
        }
        T.DFS(0,0,0, arr, arr2);
        System.out.print(answer);
    }
}
