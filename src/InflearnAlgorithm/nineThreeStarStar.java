package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point22 implements Comparable<Point22> {
    public int time;
    public char state;

    Point22(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Point22 o) {
        if (this.time==o.time) return this.state-o.state;
        return this.time-o.time;
    }
}

class nineThreeStarStar {
   public int solution(ArrayList<Point22> list, int n) {
       int answer=0, cnt=0;
       Collections.sort(list);
       for (Point22 x: list){
           if (x.state=='s') cnt++;
           else cnt--;
           answer=Math.max(answer,cnt);
       }
       return answer;
   }

    public static void main(String[] args) {
        nineThreeStarStar T = new nineThreeStarStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point22> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(new Point22(a, 's'));
            list.add(new Point22(b, 'e'));
        }
        System.out.print(T.solution(list, n));
    }
}