package AlgorithmPractice;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point12 implements Comparable<Point12> {
    int vex, cost;

    Point12(int vex, int cost) {
        this.vex=vex;
        this.cost=cost;
    }

    @Override
    public int compareTo(Point12 o) {
        return this.cost-o.cost;
    }
}

class nineEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Point12>> graph = new ArrayList<ArrayList<Point12>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Point12>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            graph.get(a).add(new Point12(b, c));
            graph.get(b).add(new Point12(a, c));
        }
        int answer = 0;
        PriorityQueue<Point12> pq = new PriorityQueue<>();
        pq.offer(new Point12(1, 0));
        while (!pq.isEmpty()) {
            Point12 tmp = pq.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer+=tmp.cost;
                for (Point12 ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) pq.offer(new Point12(ob.vex, ob.cost));
                }
            }
        }
        System.out.print(answer);
    }
}