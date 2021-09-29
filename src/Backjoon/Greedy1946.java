package Backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point2 implements Comparable<Point2> {
    int s1, s2;
    Point2(int s1,int s2) {
        this.s1=s1;
        this.s2=s2;
    }

    @Override
    public int compareTo(Point2 o) {
        if (this.s1==o.s1) return this.s1-o.s1;
        else return this.s2-o.s2;
    }
}

public class Greedy1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        ArrayList<Point2> list = new ArrayList<>();
        for (int i=0; i<t; i++) {
            list.clear();
            int n=Integer.parseInt(br.readLine());
            int answer=0;
            for (int j=0; j<n; j++) {
                StringTokenizer st= new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.add(new Point2(a,b));
            }
            Collections.sort(list);
            int max=Integer.MAX_VALUE;
            for (Point2 x : list) {
                if (x.s1<=max) {
                    max=x.s1;
                    answer++;
                }
            }
            bw.write(answer+"");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
