package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Stack2 {
    static class Point {
        int idx,p;
        Point(int idx,int p) {
            this.idx=idx;
            this.p=p;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer=0;
        Queue<Point> q = new LinkedList<>();
        for (int i=0; i<priorities.length; i++) {
            q.offer(new Point(i,priorities[i]));
        }
        while (!q.isEmpty()) {
            boolean flag=false;
            Point tmp = q.poll();
            for (Point x : q) {
                if (x.p>tmp.p) {
                    q.offer(tmp);
                    flag=true;
                    break;
                }
            }
            if (!flag) {
                answer++;
                if (tmp.idx==location) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Stack2 T = new Stack2();
        int[] priorities={1,1,9,1,1,1};
        int location=0;
        System.out.println(T.solution(priorities,location));
    }
}
