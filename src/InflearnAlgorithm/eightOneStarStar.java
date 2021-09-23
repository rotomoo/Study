package InflearnAlgorithm;

import java.util.Scanner;

public class eightOneStarStar {
    static String answer = "NO";
    static int n, total=0;
    static boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (total/2<sum) return;
        if (L==n) {
            if ((total-sum)==sum) {
                answer = "YES";
                flag=true;
            }
        }
        else {
            DFS(L+1,sum+arr[L], arr);
            DFS(L+1,sum, arr);
        }
    }

    public static void main(String[] args) {
        eightOneStarStar T = new eightOneStarStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scanner.nextInt();
            total+=arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}