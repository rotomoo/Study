package AlgorithmPractice;

import java.util.Scanner;

public class eightFourRetry {
    static int n,m;
    static int[] answer;
    public void DFS(int L) {
        if (L==m) {
            for (int x : answer) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=1; i<=n; i++) {
                answer[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        eightFourRetry T = new eightFourRetry();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        answer=new int[m];
        T.DFS(0);
    }
}