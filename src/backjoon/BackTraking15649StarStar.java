package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BackTraking15649StarStar {
    static int n,m;
    static int[] arr, ch;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void DFS(int L) throws IOException {
        if (L==m) {
            for (int x : arr) bw.write(x+" ");
            bw.newLine();
        }
        else {
            for (int i=1; i<=n; i++) {
                if (ch[i]==0) {
                    arr[L] = i;
                    ch[i]=1;
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        ch = new int[n+1];
        DFS(0);
        bw.flush();
        bw.close();
    }
}
