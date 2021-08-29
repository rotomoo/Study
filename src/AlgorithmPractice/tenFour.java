package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point13 implements Comparable<Point13> {
    int s, h, w;

    Point13(int s, int h, int w) {
        this.s=s;
        this.h=h;
        this.w=w;
    }

    @Override
    public int compareTo(Point13 o) {
        return o.s-this.s;
    }
}

class tenFour {
    static int[] dy;
    public int solution(ArrayList<Point13> arr) {
        int answer=0;
        Collections.sort(arr);
        dy[0]=arr.get(0).h;
        answer=dy[0];
        for (int i=1; i<arr.size(); i++) {
            int max=0;
            for (int j=i-1; j>=0; j--) {
                if (arr.get(j).w>arr.get(i).w && dy[j]>max) {
                    max=dy[j];
                }
            }
            dy[i]=arr.get(i).h+max;
            answer=Math.max(answer,dy[i]);
        }
        for (int x: dy) System.out.println(x);
        return answer;
    }

    public static void main(String[] args) {
        tenFour T = new tenFour();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point13> arr= new ArrayList<>();
        dy= new int[n];
        for (int i=0; i<n; i++) {
            int s=scanner.nextInt();
            int h=scanner.nextInt();
            int w=scanner.nextInt();
            arr.add(new Point13(s, h, w));
        }
        System.out.print(T.solution(arr));
    }
}
