package AlgorithmPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class eightFive {
    static int answer=Integer.MAX_VALUE, n, m;
    static Integer[] arr;
    public void DFS(int L,int sum,Integer[] arr) {
        if (L>=answer) {
            return;
        }
        if (sum>m) {
            return;
        }
        if (sum==m) {
            answer=Math.min(L , answer);
        }
        else {
            for (int i=0; i<n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        eightFive T = new eightFive();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        m = scanner.nextInt();
        T.DFS(0,0,arr);
        System.out.print(answer);
    }
}
