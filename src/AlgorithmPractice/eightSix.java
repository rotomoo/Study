package AlgorithmPractice;

import java.util.Scanner;

public class eightSix {
    static int n, m;
    static int[] tmp, ch, arr;
    public void DFS(int L) {
        if (L==m) {
            for (int x : tmp) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=0;i<n;i++) {
                if (ch[i]==0) {
                    tmp[L]=arr[i];
                    ch[i]=1;
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightSix T = new eightSix();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr =new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        tmp = new int[m];
        ch = new int[n];
        T.DFS(0);
    }
}
