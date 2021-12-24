package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmp1 = Integer.MAX_VALUE;
        int answer = 0;
        for (int i=0; i<4; i++) {
            int a = Integer.parseInt(br.readLine());
            answer += a;
            tmp1 = Math.min(tmp1, a);
        }
        int tmp2 = Math.max(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
        answer -= tmp1;
        answer += tmp2;
        System.out.println(answer);
    }
}
