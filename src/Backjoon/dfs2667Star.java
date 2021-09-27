package Backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class dfs2667Star {
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int n;
    static int[][] graph;

    public static void DFS(int x, int y, int cnt) {
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && graph[nx][ny] == 1) {
                graph[nx][ny]+=cnt;
                DFS(nx, ny,cnt);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        for (int i=0; i<n; i++) {
            String tmp = br.readLine();
            for (int j=0; j<n; j++) {
                graph[i][j]= Integer.parseInt(String.valueOf(tmp.charAt(j)));
            }
        }
        int cnt=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j]==1) {
                    cnt++;
                    graph[i][j]+=cnt;
                    DFS(i,j,cnt);
                }
            }
        }
        bw.write(cnt+"\n");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=2;i<=cnt+1;i++) {
            int tmp=0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (graph[j][k]==i) tmp++;
                }
            }
            list.add(tmp);
        }
        Collections.sort(list);
        for (int x : list) bw.write(x+"\n");
        bw.flush();
        bw.close();
    }
}
