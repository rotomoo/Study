package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point20 implements Comparable<Point20> {
    int x, y;

    Point20(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point20 o) {
        return o.x - this.x;
    }
}

class nineOneStarStar {

    public int solution(int n, ArrayList<Point20> list) {
        int answer=0, max=0;
        Collections.sort(list);
        for (Point20 x : list) {
            if (x.y>max) {
                max=x.y;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        nineOneStarStar T = new nineOneStarStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point20> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(new Point20(a,b));
        }
        System.out.println(T.solution(n, list));
    }
}
