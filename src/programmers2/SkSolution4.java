package programmers2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class SkSolution4 {
    static class Point implements Comparable<Point> {
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

    public static long solution(int n, int[][] edges) {
        long answer = 0;
        ArrayList<ArrayList<Point>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] x : edges) {
            list.get(x[0]).add(new Point(x[1], 1));
            list.get(x[1]).add(new Point(x[0], 1));
        }
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            PriorityQueue<Point> pq = new PriorityQueue<>();
            int[] result = new int[n];
            Arrays.fill(result, Integer.MAX_VALUE);
            result[i] = 0;
            pq.offer(new Point(i, 0));
            while (!pq.isEmpty()) {
                Point tmp = pq.poll();
                if (tmp.cost > result[tmp.vex]) continue;
                int nowVex = tmp.vex;
                int nowCost = tmp.cost;
                for (Point ob : list.get(nowVex)) {
                    if (result[ob.vex] > nowCost + ob.cost) {
                        result[ob.vex] = nowCost + ob.cost;
                        pq.offer(new Point(ob.vex, nowCost + ob.cost));
                    }
                }
            }
            graph[i] = result;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) continue;
                for (int k = 0; k < n; k++) {
                    if (j==k) continue;
                    if (graph[i][k] == graph[i][j] + graph[j][k]) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(5, new int[][]{{0,1},{0,2},{1,3},{1,4}}));
    }
}