package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathDfs1629StarStar {
    static long c;

    public static long DFS(long a, long b) {
        a%=c;
        if (b==0) return 1;
        else if (b%2==0) return DFS(a*a,b/2)%c;
        else return a*DFS(a*a,(b-1)/2)%c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        System.out.println(DFS(a,b));
    }
}
