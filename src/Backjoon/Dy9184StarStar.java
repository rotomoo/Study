package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Dy9184StarStar {
    static int[][][] dy;
    public static int DFS(int a,int b,int c) {
        if (a>=0 && b>=0 && c>=0 && a<=20 && b<=20 && c<=20 && dy[a][b][c]>0) return dy[a][b][c];
        if (a<=0 || b<=0 || c<=0) return 1;
        else if (a>20 || b>20 || c>20) return dy[20][20][20]=DFS(20,20,20);
        else if (a<b && b<c) return dy[a][b][c]=DFS(a,b,c-1)+DFS(a,b-1,c-1)-DFS(a,b-1,c);
        else return dy[a][b][c]=DFS(a-1,b,c)+DFS(a-1,b-1,c)+DFS(a-1,b,c-1)-DFS(a-1,b-1,c-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dy = new int[21][21][21];
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a==-1 && b==-1 && c==-1) break;
            bw.write("w("+a+", "+b+", "+c+") = "+DFS(a,b,c)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
