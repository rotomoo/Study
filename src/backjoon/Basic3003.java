package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Basic3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] first = {1,1,2,2,2,8};
        for (int i=0; i<6; i++) {
            bw.write(first[i]-Integer.parseInt(st.nextToken())+" ");
        }
        bw.flush();
        bw.close();
    }
}
