package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point27 implements Comparable<Point27>{
    int s, h, w;
    Point27(int s, int h, int w) {
        this.s=s;
        this.h=h;
        this.w=w;
    }

    @Override
    public int compareTo(Point27 o) {
        return o.w-this.w;
    }
}

class tenFourStarStar {
    static int[] dy;
    public int solution(int n, ArrayList<Point27> list) {
        int answer=0;
        Collections.sort(list);
        dy[0]=list.get(0).h;
        answer=dy[0];
        for (int i=1; i<n; i++) {
            int max=0;
            for (int j=i-1; j>=0; j--) {
                if (list.get(i).s<list.get(j).s && dy[j]>max) max=dy[j];
            }
            dy[i]=list.get(i).h+max;
            answer=Math.max(answer,dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        tenFourStarStar T = new tenFourStarStar();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Point27> list = new ArrayList<>();
        dy= new int[n];
        for (int i=0; i<n; i++) {
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            list.add(new Point27(a, b, c));
        }
        System.out.print(T.solution(n,list));
    }
}