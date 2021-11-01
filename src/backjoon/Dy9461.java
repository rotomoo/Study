package backjoon;

import java.io.*;

public class Dy9461 {
    static long[] dy;

    public static long DFS(int n) {
        if (dy[n]>0) return dy[n];
        else return dy[n]=DFS(n-1)+DFS(n-5);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        dy = new long[101];
        dy[1]=1;
        dy[2]=1;
        dy[3]=1;
        dy[4]=2;
        dy[5]=2;
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(DFS(n)+"\n");
        }
        bw.flush();
        bw.close();
    }
}