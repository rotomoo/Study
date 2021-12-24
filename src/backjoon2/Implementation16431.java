package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implementation16431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int jx = Integer.parseInt(st.nextToken());
        int jy = Integer.parseInt(st.nextToken());

        int b_cnt = Math.max(Math.abs(bx-jx),Math.abs(by-jy));
        int d_cnt = Math.abs(dx-jx)+Math.abs(dy-jy);
        if (b_cnt==d_cnt) System.out.println("tie");
        else if (b_cnt>d_cnt) System.out.println("daisy");
        else System.out.println("bessie");
    }
}
