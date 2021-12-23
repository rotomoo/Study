package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.println(l-(int)Math.max(Math.ceil((double)a/c),Math.ceil((double)b/d)));
//        if (a/c >= b/d) {
//            if (a%c==0) System.out.println(l-a/c);
//            else System.out.println(l-1-a/c);
//        }
//        else {
//            if (b%d==0) System.out.println(l-b/d);
//            else System.out.println(l-1-b/d);
    }
}
