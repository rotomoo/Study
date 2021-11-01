package backjoon;

import java.io.*;
import java.util.PriorityQueue;

public class Pq11286StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1)==Math.abs(o2)) return o1-o2;
            else return Math.abs(o1)-Math.abs(o2);
        });
        for (int i=0; i<n; i++) {
            int tmp=Integer.parseInt(br.readLine());
            if (tmp==0) {
                if (!pq.isEmpty()) bw.write(pq.poll()+"\n");
                else bw.write(0+"\n");
            }
            else pq.offer(tmp);
        }
        bw.flush();
        bw.close();
    }
}
