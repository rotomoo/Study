package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfsbfs1260 {
    static int[] ch;
    static int[][] graph;
    static int m,n;

    public static void DFS(int v) {
        System.out.print(v+" ");
        for (int i=1; i<=n; i++) {
            if (ch[i]==0 && graph[v][i]==1) {
                ch[i]=1;
                DFS(i);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        while (!q.isEmpty()) {
            int tmp =q.poll();
            System.out.print(tmp+" ");
            for (int i=1; i<=n; i++) {
                if (ch[i]==0 && graph[tmp][i]==1) {
                    ch[i]=1;
                    q.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        ch = new int[n+1];
        graph = new int[n+1][n+1];
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b]=1;
            graph[b][a]=1;
        }
        ch[v]=1;
        DFS(v);
        Arrays.fill(ch,0);
        System.out.println();
        ch[v]=1;
        BFS(v);
    }
}
