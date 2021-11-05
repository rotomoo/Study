package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bfs13460NotSolve {
    static class Point{
        int rx,ry,bx,by,cnt;
        Point(int rx,int ry,int bx,int by,int cnt) {
            this.rx=rx;
            this.ry=ry;
            this.bx=bx;
            this.by=by;
            this.cnt=cnt;
        }
    }
    static int n,m,answer=-1;
    static int[][][][] ch;
    static char[][] map;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};

    public static void BFS(Queue<Point> q) {
        while (!q.isEmpty()) {
            if (answer>10) {
                answer=-1;
                return;
            }
            Point tmp = q.poll();
            ch[tmp.rx][tmp.ry][tmp.bx][tmp.by]=1;
            if (map[tmp.bx][tmp.by]=='O') continue;
            if (map[tmp.rx][tmp.ry] == 'O') {
                answer=tmp.cnt;
                return;
            }
            for (int i=0; i<4; i++) {
                int bnx = tmp.bx;
                int bny = tmp.by;
                while (true) {
                    bnx+=dx[i];
                    bny+=dy[i];
                    if (map[bnx][bny]=='O') break;
                    else if (map[bnx][bny]=='#') {
                        bnx-=dx[i];
                        bny-=dy[i];
                        break;
                    }
                }
                int rnx = tmp.rx;
                int rny = tmp.ry;
                while (true) {
                    rnx+=dx[i];
                    rny+=dy[i];
                    if (map[rnx][rny]=='O') break;
                    else if (map[rnx][rny]=='#') {
                        rnx-=dx[i];
                        rny-=dy[i];
                        break;
                    }
                }
                if (rnx==bnx && rny==bny && map[rnx][rny]!='O') {
                    int r_dis = Math.abs(tmp.rx - rnx) + Math.abs(tmp.ry - rny);
                    int b_dis = Math.abs(tmp.bx - bnx) + Math.abs(tmp.by - bny);
                    if(r_dis > b_dis) {
                        rnx -= dx[i];
                        rny -= dy[i];
                    }
                    else {
                        bnx -= dx[i];
                        bny -= dy[i];
                    }
                }
                if (ch[rnx][rny][bnx][bny]==0) {
                    ch[rnx][rny][bnx][bny]=1;
                    q.offer(new Point(rnx,rny,bnx,bny, tmp.cnt+1));
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        map= new char[n][m];
        ch= new int[n][m][n][m];
        int rx=0,ry=0,bx=0,by=0;
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<m; j++) {
                map[i][j]=str.charAt(j);
                if (map[i][j]=='B') {
                    bx=i;
                    by=j;
                }
                if (map[i][j]=='R') {
                    rx=i;
                    ry=j;
                }
            }
        }
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(rx,ry,bx,by,0));
        BFS(q);
        System.out.println(answer);
    }
}
