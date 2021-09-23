package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point21 implements Comparable<Point21> {
    int x, y;

    Point21(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point21 o) {
        if (this.y==o.y) return this.x-o.x;
        else return this.y - o.y;
    }
}

class nineTwoStar {

    public int solution(int n, ArrayList<Point21> list) {
        int answer=0, et=0;
        Collections.sort(list);
        for (Point21 x : list) {
            if (x.x>=et) {
                answer++;
                et=x.y;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        nineTwoStar T = new nineTwoStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point21> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(new Point21(a,b));
        }
        System.out.println(T.solution(n, list));
    }
}
