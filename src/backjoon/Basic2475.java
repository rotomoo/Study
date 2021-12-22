package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basic2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int i=0; i<5; i++) {
            answer += Math.pow(Integer.parseInt(st.nextToken()),2)%10;
        }
        System.out.println(answer%10);
    }
}
