package InflearnRetry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eight7Star {
    static int[][] arr;
    public static int DFS(int n, int r) {
        if (arr[n][r]>0) return arr[n][r];
        if (n==r || r==0) return arr[n][r]=1;
        else return arr[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int r= Integer.parseInt(st.nextToken());
        arr = new int[n+1][r+1];
        System.out.print(DFS(n,r));
    }
}
