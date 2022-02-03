package numberOfCases;

import java.util.Scanner;

public class CombinationWithRepetition {
    static int n, r;
    static int[] cb;

    public static void DFS(int L, int start) {
        if (L==r) {
            for (int x: cb) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=start; i<=n; i++) {
                cb[L]=i;
                DFS(L+1, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        cb = new int[r];
        DFS(0,1);
    }
}