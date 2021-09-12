package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point8 implements Comparable<Point8> {
    int time,state;

    Point8(int time, char state) {
        this.time=time;
        this.state=state;
    }

    @Override
    public int compareTo(Point8 o) {
        if (this.time==o.time) return this.state-o.state;
        else return this.time-o.time;
    }
}

class nineThree {
    public int solution(ArrayList<Point8> list) {
        int cnt=0;
        int answer=0;
        Collections.sort(list);
        for (Point8 ob : list) {
            if (ob.state=='s') cnt++;
            else cnt--;
            answer=Math.max(cnt, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        nineThree T = new nineThree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point8> list =new ArrayList<>();
        for (int i=0; i<n; i++){
            int st=scanner.nextInt();
            int et=scanner.nextInt();
            list.add(new Point8(st, 's'));
            list.add(new Point8(et, 'e'));
        }
        System.out.print(T.solution(list));
    }
}
