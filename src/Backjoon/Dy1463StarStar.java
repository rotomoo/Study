package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dy1463StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dy = new int[x+1];
        for (int i=2; i<=x; i++) {
            dy[i]=dy[i-1]+1;
            if (i%3==0) dy[i]=Math.min(dy[i],dy[i/3]+1);
            if (i%2==0) dy[i]=Math.min(dy[i],dy[i/2]+1);
        }
        System.out.print(dy[x]);
    }
}