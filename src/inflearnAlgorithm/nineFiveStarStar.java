package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point10 implements Comparable<Point10> {
    int vex, cost;
    Point10(int vex,int cost) {
        this.vex=vex;
        this.cost=cost;
    }
    @Override
    public int compareTo(Point10 ob) {
        return this.cost-ob.cost;
    }
}

class nineFiveStarStar {
    static int n, m;
    static ArrayList<ArrayList<Point10>> graph;
    static int[] dis;

    public void solution(int v) {
        PriorityQueue<Point10> pq= new PriorityQueue<>();
        pq.offer(new Point10(v, 0));
        dis[v]=0;
        while (!pq.isEmpty()) {
            Point10 tmp=pq.poll();
            int now=tmp.vex;
            int nowCost=tmp.cost;
            if (nowCost>dis[now]) continue;
            for (Point10 ob : graph.get(now)) {
                if (dis[ob.vex]>nowCost+ob.cost) {
                    dis[ob.vex]=nowCost+ob.cost;
                    pq.offer(new Point10(ob.vex, nowCost+ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        nineFiveStarStar T = new nineFiveStarStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<ArrayList<Point10>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Point10>());
        }
        dis=new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for (int i=0; i<m; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            graph.get(a).add(new Point10(b, c));
        }
        T.solution(1);
        for(int i=2; i<=n; i++){
            if (dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+ dis[i]);
            else System.out.println(i+" : impossible");
        }
    }
}
