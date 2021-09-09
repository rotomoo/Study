package AlgorithmPractice;

import java.util.Scanner;

public class eightSixStar {
    static int n,m;
    static int[] arr, answer, ch;

    public void DFS(int L) {
        if (L==m){
            for (int x : answer) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=0; i<n; i++) {
                if (ch[i]==0) {
                    answer[L] = arr[i];
                    ch[i]=1;
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        eightSixStar T = new eightSixStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n];
        answer = new int[m];
        ch =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        T.DFS(0);
    }
}