package Backjoon;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Pq11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<n; i++) {
            int tmp=Integer.parseInt(br.readLine());
            if (tmp==0) {
                if (!pq.isEmpty()) {
                    bw.write(pq.poll()+"\n");
                }
                else bw.write(0+"\n");
            }
            else pq.offer(tmp);
        }
        bw.flush();
        bw.close();
    }
}
