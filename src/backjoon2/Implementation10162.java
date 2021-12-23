package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println(t%10==0 ? t/300+" "+t%300/60+" "+t%60/10:-1);
//        int[] arr = {300,60,10};
//        int t = Integer.parseInt(br.readLine());
//        if (t%10!=0) {
//            System.out.println(-1);
//            System.exit(0);
//        }
//        int[] answer = new int[3];
//        for (int i=0; i<3; i++) {
//            answer[i] = t / arr[i];
//            t %= arr[i];
//        }
//        for (int x : answer) System.out.print(x+" ");
    }
}
