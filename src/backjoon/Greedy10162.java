package backjoon;

import java.io.*;

public class Greedy10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] arr = {300,60,10};
        int[] arr2 = new int[3];
        if (t%10!=0) {
            System.out.print(-1);
            return;
        }
        for (int i=0; i<3;i++) {
            if (arr[i]<=t) {
                arr2[i]=t/arr[i];
                t%=arr[i];
                if (t==0) break;
            }
        }
        for (int x : arr2) bw.write(x+" ");
        bw.flush();
        bw.close();
    }
}
