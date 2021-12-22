package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Basic2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tmp = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<5; i++) {
            bw.write(Integer.parseInt(st.nextToken())-tmp+" ");
        }
        bw.flush();
        bw.close();
    }
}
