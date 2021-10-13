package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsBfs14502StarStar {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    static int n,m,answer;
    static int[][] graph, dis;
    static int[] dx= {-1,0,1,0};
    static int[] dy= {0,1,0,-1};

    public static void BFS() {
        Queue<Point> q = new LinkedList<>();
        dis = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                dis[i][j]=graph[i][j];
                if (graph[i][j]==2) q.offer(new Point(i,j));
            }
        }
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i=0; i<4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m && dis[nx][ny]==0) {
                    dis[nx][ny]=2;
                    q.offer(new Point(nx,ny));
                }
            }
        }
        count();
    }

    public static void count() {
        int cnt=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (dis[i][j]==0) cnt++;
            }
        }
        answer=Math.max(answer,cnt);
    }

    public static void DFS(int L) {
        if (L==3) {
            BFS();
        }
        else {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (graph[i][j]==0) {
                        graph[i][j]=1;
                        DFS(L+1);
                        graph[i][j]=0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        DFS(0);
        System.out.print(answer);
    }
}
