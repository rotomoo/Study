package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Arr17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] answer = {"Soongsil", "Korea", "Hanyang"};
        int sum = 0;
        int tmp = Integer.MAX_VALUE;
        int idx = 0;
        for (int i=0; i<3; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            if (tmp > num) {
                tmp = num;
                idx = i;
            }
        }
        System.out.println(sum>=100 ? "OK" : answer[idx]);
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(Integer.parseInt(st.nextToken()),"Soongsil");
//        map.put(Integer.parseInt(st.nextToken()),"Korea");
//        map.put(Integer.parseInt(st.nextToken()),"Hanyang");
//        int score = 0;
//        int tmp = Integer.MAX_VALUE;
//        for (int x : map.keySet()) {
//            score += x;
//            tmp = Math.min(tmp, x);
//        }
//        if (score >= 100) System.out.println("OK");
//        else System.out.println(map.get(tmp));
    }
}
