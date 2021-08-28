package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point7 implements Comparable<Point7> {
    public int st, et;

    Point7(int st, int et) {
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Point7 o) {
        if (this.et == o.et) return this.st - o.st;
        else return this.et-o.et;
    }
}

class nineTwo {
   public int solution(ArrayList<Point7> list, int n) {
       int answer=0;
       Collections.sort(list);
       int max=0;
       for (Point7 ob: list) {
           if (ob.st>=max) {
               answer++;
               max=ob.et;
           }
       }
       return answer;
   }

    public static void main(String[] args) {
        nineTwo T = new nineTwo();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point7> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int st = scanner.nextInt();
            int et = scanner.nextInt();
            list.add(new Point7(st, et));
        }
        System.out.print(T.solution(list, n));
    }
}