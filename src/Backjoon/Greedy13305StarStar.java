package Backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Greedy13305StarStar {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        Long[] dis=new Long[n-1], cost=new Long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n-1; i++) dis[i]=Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) cost[i]=Long.parseLong(st.nextToken());
        long answer=0, tmp=cost[0];
        for (int i=0; i<n-1; i++) {
            tmp=Math.min(tmp,cost[i]);
            answer+=tmp*dis[i];
        }
        System.out.print(answer);
    }
}
