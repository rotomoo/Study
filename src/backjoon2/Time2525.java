package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Time2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
        hour += min/60;
        System.out.println(hour%24+" "+min%60);
//        int tmp = hour*60 + min;
//        if (tmp >= 1440) tmp -= 1440;
//        System.out.println(tmp/60 +" " + tmp%60);
    }
}
