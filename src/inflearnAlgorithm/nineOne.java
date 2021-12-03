package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point6 implements Comparable<Point6> {
    public int x, y;

    Point6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point6 o) {
        if (this.x == o.x) return o.y - this.y;
        else return o.x - this.x;
    }
}

class nineOne {

    public int solution(int n, ArrayList<Point6> list) {
        int answer=0;
        Collections.sort(list);
        int max=Integer.MIN_VALUE;
        for (Point6 ob : list) {
            if (ob.y>max) {
                max=ob.y;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        nineOne T = new nineOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point6> list=new ArrayList<>();
        for (int i=0; i<n; i++) {
            int x= scanner.nextInt();
            int y= scanner.nextInt();
            list.add(new Point6(x,y));
        }
        System.out.print(T.solution(n, list));
    }
}
