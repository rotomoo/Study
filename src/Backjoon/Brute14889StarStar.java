package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brute14889StarStar {
    static int[] ch;
    static int n;
    static int[][] graph;
    static int answer=Integer.MAX_VALUE;

    public static void score() {
        int start=0;
        int link=0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (ch[i]==1 && ch[j]==1) {
                    start+=graph[i][j];
                    start+=graph[j][i];
                }
                else if (ch[i]==0 && ch[j]==0) {
                    link+=graph[i][j];
                    link+=graph[j][i];
                }
            }
        }
        int tmp= Math.abs(start-link);
        if (tmp==0) {
            System.out.print(0);
            System.exit(0);
        }
        answer=Math.min(answer,tmp);
    }

    public static void DFS(int L, int s) {
        if (L==n/2) {
            score();
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
        n= Integer.parseInt(br.readLine());
        graph = new int[n][n];
        ch = new int[n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        DFS(0,0);
        System.out.print(answer);
    }
}
