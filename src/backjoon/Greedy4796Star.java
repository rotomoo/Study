package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Greedy4796Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt=0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cnt++;
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (l==0 && p==0 && v==0) break;
            int answer=v/p*l+Math.min(v%p,l);
            bw.write("Case "+cnt+": "+answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
