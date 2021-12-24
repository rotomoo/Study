package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int a1 = n+c;
        int a2 = n-c;
        System.out.println( a1%2!=0 || a2%2!=0 || a1<0 || a2<0 ? -1 : a1/2+" "+a2/2);
    }
}
