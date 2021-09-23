package AlgorithmPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tenSixRetry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dy= new int[m+1];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int ps= Integer.parseInt(st.nextToken());
            int pt= Integer.parseInt(st.nextToken());
            for (int j=m; j>=pt; j--) {
                dy[j]=Math.max(dy[j],dy[j-pt]+ps);
            }
        }
        System.out.println(dy[m]);
    }
}
