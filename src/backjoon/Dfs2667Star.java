package backjoon;

import java.util.Collections;
import java.util.ArrayList;
import java.io.*;

class Dfs2667Star {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int bCnt, n;
    static int[][] ch, graph;

    public static void DFS(int x, int y) {
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && graph[nx][ny]==1 && ch[nx][ny]==0) {
                ch[nx][ny]=1;
                DFS(nx, ny);
                bCnt++;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Integer> answer = new ArrayList<>();
        graph = new int[n][n];
        ch = new int[n][n];
        for (int i=0; i<n; i++) {
            String tmp = br.readLine();
            for (int j=0; j<n; j++) {
                graph[i][j] = tmp.charAt(j)-'0';
            }
        }
        int aCnt = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j] == 1 && ch[i][j]==0) {
//                    System.out.print(i+" "+j);
                    aCnt++;
                    ch[i][j]=1;
                    bCnt=1;
                    DFS(i,j);
                    answer.add(bCnt);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(aCnt);
        for (int x: answer) {
            System.out.println(x);
        }
    }
}