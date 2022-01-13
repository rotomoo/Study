package inflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point26 implements Comparable<Point26> {
    int vex,cost;

    Point26(int vex, int cost) {
        this.vex=vex;
        this.cost=cost;
    }

    @Override
    public int compareTo(Point26 o) {
        return this.cost-o.cost;
    }
}

class nineEightStarStar {
    static ArrayList<ArrayList<Point26>> graph;
    static int[] ch;
    static int answer=0;
    public void BFS(int v, int cost) {
        PriorityQueue<Point26> pq = new PriorityQueue<>();
        pq.offer(new Point26(v,cost));
        while (!pq.isEmpty()) {
            Point26 tmp = pq.poll();
            int ev= tmp.vex;
            if(ch[ev]==0) {
                ch[ev]=1;
                answer+=tmp.cost;
                for (Point26 o : graph.get(ev)) {
                    if (ch[o.vex]==0) pq.offer(new Point26(o.vex,o.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        nineEightStarStar T = new nineEightStarStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) graph.add(new ArrayList<>());
        ch=new int[n+1];
        for (int i = 0; i < m; i++) {
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            graph.get(a).add(new Point26(b,c));
            graph.get(b).add(new Point26(a,c));
        }
        T.BFS(1,0);
        System.out.print(answer);
    }
}
