package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy1080Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] graph = new int[n][m];
        int[][] graph2 = new int[n][m];
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<m; j++) {
                graph[i][j]=str.charAt(j)-'0';
            }
        }
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<m; j++) {
                graph2[i][j]=str.charAt(j)-'0';
            }
        }
        int cnt=0;
        for (int i=0; i<=n-3; i++) {
            for (int j=0; j<=m-3; j++) {
                if (graph[i][j]!=graph2[i][j]) {
                    cnt++;
                    for (int k=i; k<i+3; k++) {
                        for (int l=j;l<j+3; l++) {
                            graph[k][l]=1-graph[k][l];
                        }
                    }
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (graph[i][j]!=graph2[i][j]) {
                    System.out.print(-1);
                    return;
                }
            }
        }
        System.out.print(cnt);
    }
}
