package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bfs7576StarStar {
    static class Point {
        int x ,y;
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    static int[][] graph, dis;
    static int m,n;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void BFS() {
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i=0; i<4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m && graph[nx][ny]==0) {
                    graph[nx][ny]=1;
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                    q.offer(new Point(nx,ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        dis = new int[n][m];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                graph[i][j]=Integer.parseInt(st.nextToken());
                if (graph[i][j]==1) q.offer(new Point(i,j));
            }
        }
        BFS();
        int max =Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (graph[i][j]==0) {
                    System.out.println(-1);
                    return;
                }
                max=Math.max(max,dis[i][j]);
            }
        }
        System.out.print(max);
    }
}
