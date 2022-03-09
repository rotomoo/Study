package backjoon;

import java.util.ArrayList;

public class BruteDfs {
    static int[] ch;
    static int answer;
    static ArrayList<ArrayList<Point>> list;
    static int[] numsTmp;
    static class Point {
        int vex, cost;

        public Point(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }
    }

    public static void DFS(int nowVex, int sum, int time) {
        if (time<0) return;
        ch[nowVex]++;
        if (ch[nowVex]==1) sum += numsTmp[nowVex];
        if (nowVex==0) answer = Math.max(answer, sum);
        for (Point ob : list.get(nowVex)) {
            DFS(ob.vex, sum, time-ob.cost);
        }
        ch[nowVex]--;
    }

    public static int Solution(int[] nums, int[][] edges, int k) {
        list = new ArrayList<>();
        ch = new int[nums.length];
        numsTmp = nums;
        for (int i = 0; i < nums.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] x : edges) {
            list.get(x[0]).add(new Point(x[1], x[2]));
            list.get(x[1]).add(new Point(x[0], x[2]));
        }
        DFS(0, 0, k);
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {7, 20, 5, 30};
        int[][] edges = {{0, 1, 11}, {1, 2, 12}, {2, 3, 15}, {1, 3, 17}};
        int k = 53;
        System.out.println(Solution(nums, edges, k));
    }
}
