package Backjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
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
    static Queue<Point> q1 = new LinkedList<>();
    static Queue<Point> q2 = new LinkedList<>();
    static int[][] ch,ch2;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean in(int nx, int ny) {
        if (nx>=0 && nx<h && ny>=0 && ny<w) return true;
        else return false;
    }

    public static boolean check() {
        for (int i=0; i<w; i++) {
            if (map[0][i]=='$' || map[h-1][i]=='$') return true;
        }
        for (int i=0; i<h; i++) {
            if (map[i][0]=='$' || map[i][w-1]=='$') return true;
        }
        return false;
    }

    public static void BFS2(int answer) throws IOException {
        Queue<Point> tmpq=new LinkedList<>();
        boolean flag=false;
        while (!q2.isEmpty()) {
            Point tmp = q2.poll();
            for (int j=0; j<4; j++) {
                int nx = tmp.x+dx[j];
                int ny = tmp.y+dy[j];
                if (in(nx,ny) && ch2[nx][ny]==0) {
                    if (map[nx][ny]=='.' || map[nx][ny]=='$') {
                        ch2[nx][ny]=1;
                        map[nx][ny]='$';
                        q2.offer(new Point(nx,ny));
                    }
                    else if (map[nx][ny]=='#') {
                        ch2[nx][ny]=1;
                        flag=true;
                        tmpq.offer(new Point(nx,ny));
                    }
                }
            }
        }
        for (int i=0; i<h; i++) {
            System.out.println();
            for (int j=0; j<w; j++) {
                System.out.print(map[i][j]);
            }
        }
        System.out.println();
        if (check()) {
            bw.write(answer+"\n");
            return;
        }
        if (flag) {
            answer++;
            while (!tmpq.isEmpty()) {
                Point tmp= tmpq.poll();
                q2.offer(new Point(tmp.x,tmp.y));
                map[tmp.x][tmp.y]='$';
            }
            BFS2(answer);
        }
    }

    public static void BFS1(int answer) throws IOException {
        Queue<Point> tmpq=new LinkedList<>();
        boolean flag=false;
        while (!q1.isEmpty()) {
            Point tmp = q1.poll();
            for (int j=0; j<4; j++) {
                int nx = tmp.x+dx[j];
                int ny = tmp.y+dy[j];
                if (in(nx,ny) && ch[nx][ny]==0) {
                    if (map[nx][ny]=='.' || map[nx][ny]=='$') {
                        ch[nx][ny]=1;
                        map[nx][ny]='$';
                        q1.offer(new Point(nx,ny));
                    }
                    else if (map[nx][ny]=='#') {
                        ch[nx][ny]=1;
                        flag=true;
                        tmpq.offer(new Point(nx,ny));
                    }
                }
            }
        }
        for (int i=0; i<h; i++) {
            System.out.println();
            for (int j=0; j<w; j++) {
                System.out.print(map[i][j]);
            }
        }
        System.out.println();
        if (check()) {
            BFS2(answer);
            return;
        }
        if (flag) {
            answer++;
            while (!tmpq.isEmpty()) {
                Point tmp= tmpq.poll();
                q1.offer(new Point(tmp.x,tmp.y));
                map[tmp.x][tmp.y]='$';
            }
            BFS1(answer);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            int answer=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            h= Integer.parseInt(st.nextToken());
            w= Integer.parseInt(st.nextToken());
            map= new char[h][w];
            ch= new int[h][w];
            ch2= new int[h][w];
            int cnt=0;
            for (int j=0; j<h; j++) {
                String str = br.readLine();
                for (int k=0; k<w; k++) {
                    map[j][k]= str.charAt(k);
                    if (cnt==0 && map[j][k]=='$') {
                        q1.offer(new Point(j,k));
                        cnt++;
                    }
                    else if (cnt==1 && map[j][k]=='$') q2.offer(new Point(j,k));
                }
            }
            BFS1(answer);
        }
        bw.flush();
        bw.close();
    }
}
