package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point15 implements Comparable<Point15> {
    int x,y;

    Point15(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Point15 o) {
        if (this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class sixSevenStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point15> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            list.add(new Point15(x, y));
        }
        Collections.sort(list);
        for (Point15 x : list) System.out.println(x.x + " " + x.y);
    }
}