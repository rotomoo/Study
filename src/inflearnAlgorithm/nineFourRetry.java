package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point25 implements Comparable<Point25> {
    int x,y;
    Point25(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point25 o) {
        return o.y-this.y;
    }
}

class nineFourRetry {
    static int max;
    public int solution(int n, ArrayList<Point25> list) {
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);
        int j=0;
        for (int i=max; i>=1; i--) {
            for (;j<n; j++) {
                if (list.get(j).y<i) break;
                pq.offer(list.get(j).x);
            }
            if (!pq.isEmpty()) answer+=pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        nineFourRetry T = new nineFourRetry();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point25> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(new Point25(a,b));
            if (max<b) max=b;
        }
        System.out.println(T.solution(n,list));
    }
}
