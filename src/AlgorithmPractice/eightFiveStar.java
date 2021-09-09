package AlgorithmPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class eightFiveStar {
    static int answer=Integer.MAX_VALUE, n, m;
    static Integer[] arr;

    public void DFS(int L, int sum) {
        Arrays.sort(arr,Collections.reverseOrder());
        if (L>=answer) return;
        if (sum>m) return;
        if (sum==m){
            answer=Math.min(answer,L);
        }
        else {
            for (int i=0; i<n; i++) {
                DFS(L+1,sum+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        eightFiveStar T = new eightFiveStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new Integer[n];
        for (int i=0; i <n; i++) {
            arr[i] = scanner.nextInt();
        }
        m = scanner.nextInt();
        T.DFS(0,0);
        System.out.println(answer);
    }
}