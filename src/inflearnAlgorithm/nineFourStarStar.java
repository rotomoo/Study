package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point23 implements Comparable<Point23> {
    int m, t;

    Point23(int m, int t) {
        this.m = m;
        this.t = t;
    }

    @Override
    public int compareTo(Point23 o) {
        if (this.t==o.t) return o.m - this.m;
        else return o.t - this.t;
    }
}

class nineFourStarStar {
    static int max=Integer.MIN_VALUE;

    public int solution(int n, ArrayList<Point23> list) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        Collections.sort(list);
        int j=0;
        for (int i=max; i>=1; i--) {
            for (;j<n; j++) {
                if (list.get(j).t<i) break;
                pq.offer(list.get(j).m);
            }
            if (!pq.isEmpty()) answer+=pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        nineFourStarStar T = new nineFourStarStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point23> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int m = scanner.nextInt();
            int t = scanner.nextInt();
            list.add(new Point23(m, t));
            if (t>max) max=t;
        }
        System.out.println(T.solution(n, list));
    }
}
