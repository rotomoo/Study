package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Delivery {
    static class Point implements Comparable<Point>{
        int vex, cost;

        public Point(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Point o) {
            return this.cost - o.cost;
        }
    }
    static int[] result;
    static ArrayList<ArrayList<Point>> graph = new ArrayList<>();

    public static void BFS(int v) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(v, 0));
        while (!pq.isEmpty()) {
            Point tmp = pq.poll();
            if (tmp.cost > result[tmp.vex]) continue;
            for (Point x : graph.get(tmp.vex)) {
                if (result[x.vex] > tmp.cost + x.cost) {
                    result[x.vex] = tmp.cost + x.cost;
                    pq.offer(new Point(x.vex, tmp.cost + x.cost));
                }
            }

        }
    }

    public int solution(int N, int[][] road, int K) {
        result = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        Arrays.fill(result, Integer.MAX_VALUE);
        result[1]=0;
        for (int i = 0; i < road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int c = road[i][2];
            graph.get(a).add(new Point(b, c));
            graph.get(b).add(new Point(a, c));
        }
        BFS(1);
        int answer = 1;
        for (int i = 2; i <= N; i++) {
            if (result[i] <= K) answer++;
        }
        return answer;
    }
}