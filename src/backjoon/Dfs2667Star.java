package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Dfs2667Star {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] graph;
    static int n,cnt;

    public static void DFS(int x, int y) {
        for (int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && graph[nx][ny] == 1) {
                graph[nx][ny]=0;
                cnt++;
                DFS(nx,ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList();
        graph = new int[n][n];
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<n; j++) {
                graph[i][j]=Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j]==1) {
                    cnt=1;
                    graph[i][j]=0;
                    DFS(i,j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int x : list) System.out.println(x);
    }
}