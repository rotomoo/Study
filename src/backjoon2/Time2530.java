package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Time2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int s =Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
        m += s/60;
        h += m/60;
        System.out.println(h%24 + " " + m%60 + " " + s%60);
//        System.out.println((h+(m+(s/60))/60)%24 +" "+ (m+(s/60))%60 +" "+ s%60);
    }
}
