package numberOfCases;

import java.util.Scanner;

public class CombinationSubset {
    static int[] cb;
    static int n;

    public static void DFS(int L, int s, int size) {
        if (L == size) {
            for (int x: cb) System.out.print(x+" ");
            System.out.println();
            return;
        }
        for (int i = s; i < n; i++) {
            cb[L]=i;
            DFS(L + 1, i + 1, size);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            cb = new int[i+1];
            DFS(0,0, i+1);
        }
    }
}