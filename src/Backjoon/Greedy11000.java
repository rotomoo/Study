package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Greedy11000 {
    static class Point implements Comparable<Point> {
        int st,et;
        Point(int st, int et) {
            this.st=st;
            this.et=et;
        }

        @Override
        public int compareTo(Point o) {
            if (this.st==o.st) return this.et-o.et;
            else return this.st-o.st;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Point> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            list.add(new Point(a,b));
        }
        Collections.sort(list);
        pq.offer(list.get(0).et);
        for (int i=1; i<n; i++) {
            if (pq.peek()>list.get(i).st) {
                pq.offer(list.get(i).et);
            }
            else {
                pq.offer(list.get(i).et);
                pq.poll();
            }
        }
        System.out.print(pq.size());
    }
}
