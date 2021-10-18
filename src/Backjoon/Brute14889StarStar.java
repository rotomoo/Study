package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brute14889StarStar {
    static int n,answer=Integer.MAX_VALUE;
    static int[] ch;
    static int[][] graph;

    public static void DFS(int L, int s) {
        if (answer==0) return;
        if (L==n/2) {
            int score1 = 0;
            int score2 = 0;
            for (int i=0; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {
                    if (ch[i]==1 && ch[j]==1) {
                        score1 += graph[i][j]+graph[j][i];
                    }
                    else if (ch[i]==0 && ch[j]==0) {
                        score2 += graph[i][j]+graph[j][i];
                    }
                }
            }
            int tmp = Math.abs(score1-score2);
            answer = Math.min(answer, tmp);
        }
        else {
            for (int i=s; i<n; i++) {
                if (ch[i]==0) {
                    ch[i]=1;
                    DFS(L+1,i+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        ch = new int[n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        DFS(0,0);
        System.out.println(answer);
    }
}
