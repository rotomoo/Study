package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class basic10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(a+b+"\n");
        bw.write(a-b+"\n");
        bw.write(a*b+"\n");
        bw.write(a/b+"\n");
        bw.write(a%b+"\n");
        bw.flush();
        bw.close();
    }
}
