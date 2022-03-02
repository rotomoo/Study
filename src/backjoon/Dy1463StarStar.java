package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dy1463StarStar {

    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v,int cnt) {
        if (cnt >= answer) return;
        if (v==1) {
            answer = Math.min(answer, cnt);
            return;
        }
        if(v%3==0) DFS(v/3, cnt+1);
        if(v%2==0) DFS(v/2, cnt+1);
        DFS(v-1, cnt+1);
    }

    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        DFS(x,0);
        System.out.println(answer);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int x = Integer.parseInt(br.readLine());
//        int[] dy = new int[x+1];
//        for (int i=2; i<=x; i++) {
//            dy[i]=dy[i-1]+1;
//            if (i%3==0) dy[i]=Math.min(dy[i],dy[i/3]+1);
//            if (i%2==0) dy[i]=Math.min(dy[i],dy[i/2]+1);
//        }
//        System.out.print(dy[x]);
//    }
}