package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point14 implements Comparable<Point14> {
    int score, time;

    Point14(int score, int time) {
        this.score=score;
        this.time=time;
    }

    @Override
    public int compareTo(Point14 o) {
        return this.time-o.time;
    }
}

class tenSixMe {
    static int n, m;
    static int[] dy;
    public int solution(ArrayList<Point14> arr) {
        Collections.sort(arr);
        Arrays.fill(dy, 0);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= arr.get(i).time; j--) {
                dy[j] = Math.max(dy[j], dy[j - arr.get(i).time] + arr.get(i).score);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        tenSixMe T = new tenSixMe();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        ArrayList<Point14> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int score=scanner.nextInt();
            int time=scanner.nextInt();
            arr.add(new Point14(score,time));
        }
        dy= new int[m+1];
        System.out.print(T.solution(arr));
    }
}
