package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point9 implements Comparable<Point9> {
    int money, day;

    Point9(int money, int day) {
        this.money=money;
        this.day=day;
    }

    @Override
    public int compareTo(Point9 o) {
    return o.day-this.day;
    }
}

class nineFour {
    static int max=Integer.MIN_VALUE;
    public int solution(ArrayList<Point9> list, int n) {
        int answer=0;
        Collections.sort(list);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int j=0;
        for (int i=max;i>=1;i--) {
            for (; j<n; j++) {
                if (list.get(j).day<i) break;
                pq.offer(list.get(j).money);
            }
            if (!pq.isEmpty()) answer+=pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        nineFour T = new nineFour();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point9> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            list.add(new Point9(m, d));
            if (d>max) max=d;
        }
        System.out.print(T.solution(list,n));
    }
}
