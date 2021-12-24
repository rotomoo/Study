package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basic11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        System.out.println(Math.min(ax+by, bx+ay));
    }
}
