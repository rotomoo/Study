package backjoon;

import java.io.*;
import java.util.Scanner;

public class Dy9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] dy = new int[11];
        dy[1]=1;
        dy[2]=2;
        dy[3]=4;
        for (int i=4; i<11; i++) {
            dy[i]=dy[i-3]+dy[i-2]+dy[i-1];
        }
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dy[n]+"\n");
        }
        bw.flush();
        bw.close();
    }

//    static int answer;
//    public static void DFS(int L) {
//        if(L == 0) {
//            answer ++;
//        }
//        if (L>2) DFS(L-3);
//        if (L>1) DFS(L-2);
//        if (L>0) DFS(L-1);
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for(int i=0; i<x; i++) {
//            answer = 0;
//            DFS(sc.nextInt());
//            System.out.println(answer);
//        }
//    }
}
