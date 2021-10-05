package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackTraking9663StarStar {
    static int n, answer=0;
    static int[] arr;

    public static boolean isPossible(int L) {
        for (int i=0; i<L; i++) {
            if (arr[L]==arr[i]) return false;
            else if (Math.abs(L-i)==Math.abs(arr[L]-arr[i])) return false;
        }
        return true;
    }

    public static void DFS(int L) {
        if (L==n) {
            answer++;
            return;
        }
        else {
            for (int i=0; i<n; i++) {
                arr[L]=i;
                if (isPossible(L)) DFS(L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr= new int[n];
        DFS(0);
        System.out.print(answer);
    }
}