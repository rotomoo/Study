package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        double res = Math.sqrt(Math.pow(c,2) / (Math.pow(a,2) + Math.pow(b,2)));
        System.out.println((int)(b*res)+" "+(int)(a*res));
//        double l = Math.sqrt(a*a+b*b); // a : x = l : c  (l2 = a2+b2)
//        System.out.println((int)(b*c/l) + " "+ (int)(a*c/l));
    }
}
