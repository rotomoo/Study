package AlgorithmPractice;

import java.util.Scanner;

public class eightNineStarStar {
    static int n,m;
    static int[] answer;
    public void DFS(int L,int s) {
    if (L==m) {
        for (int x : answer) System.out.print(x+" ");
        System.out.println();
    }
    else {
        for (int i=s; i<=n; i++) {
                answer[L]=i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        eightNineStarStar T = new eightNineStarStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        answer = new int[m];
        T.DFS(0,1);
    }
}