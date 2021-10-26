package Backjoon;

import java.io.*;
import java.util.*;

public class Bfs9736StarStar {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int h,w;
    static char[][] map;
    static int[][] ch;
    static Deque<Point> s = new ArrayDeque<>();
    static Deque<Point> q1 = new ArrayDeque<>();
    static Deque<Point> q2 = new ArrayDeque<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean in(int nx, int ny) {
        if (nx>=0 && nx<h+2 && ny>=0 && ny<w+2) return true;
        else return false;
    }

    public static int[][] BFS(Deque<Point> q) {
        int[][] tmpdis=new int[h+2][w+2];
        ch = new int[h+2][w+2];
        while (!q.isEmpty()) {
            Point tmp = q.remove();
            ch[tmp.x][tmp.y]=1;
            for (int i=0; i<4; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (in(nx,ny)) {
                    if (map[nx][ny]=='*') {
                        ch[nx][ny]=1;
                        continue;
                    }
                    if (ch[nx][ny]==0) {
                        if (map[nx][ny] == '#') {
                            ch[nx][ny] = 1;
                            tmpdis[nx][ny] = tmpdis[tmp.x][tmp.y] + 1;
                            q.offerLast(new Point(nx, ny));
                        }
                        else {
                            ch[nx][ny] = 1;
                            tmpdis[nx][ny] = tmpdis[tmp.x][tmp.y];
                            q.offerFirst(new Point(nx, ny));
                        }
                    }
                }
            }
        }
        for (int i=0; i<h+2; i++) {
            for (int j=0; j<w+2; j++) {
                if (ch[i][j]==0 && tmpdis[i][j]==0) tmpdis[i][j]=10000;
            }
        }
        return tmpdis;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            int answer=Integer.MAX_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            h= Integer.parseInt(st.nextToken());
            w= Integer.parseInt(st.nextToken());
            map= new char[h+2][w+2];
            int cnt=0;
            for (int j=0; j<h; j++) {
                String str = br.readLine();
                for (int k=0; k<w; k++) {
                    map[j+1][k+1]= str.charAt(k);
                    if (cnt==0 && map[j+1][k+1]=='$') {
                        q1.offer(new Point(j+1,k+1));
                        cnt++;
                    }
                    else if (cnt==1 && map[j+1][k+1]=='$') {
                        q2.offer(new Point(j+1,k+1));
                    }
                }
            }
            s.offer(new Point(0,0));
            int[][] dis1 = BFS(s);
            int[][] dis2 = BFS(q1);
            int[][] dis3 = BFS(q2);
            int[][] ansdis = new int[h+2][w+2];
            for (int j=0; j<h+2; j++) {
                for (int k=0; k<w+2; k++) {
                    if (map[j][k]=='*') continue;
                    ansdis[j][k]=dis1[j][k]+dis2[j][k]+dis3[j][k];
                    if (map[j][k]=='#') ansdis[j][k]-=2;
                    answer=Math.min(answer,ansdis[j][k]);
                }
            }
            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
