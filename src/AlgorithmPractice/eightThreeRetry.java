package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Scanner;

class Point16 {
    int score,time;

    Point16(int scroe,int time) {
        this.score=scroe;
        this.time=time;
    }
}

public class eightThreeRetry {
    static ArrayList<Point16> list;
    static int n, m, answer=0;
    public void DFS(int L, int score, int time) {
        if (time>m) return;
        if (L==n) {
            answer=Math.max(answer,score);
        }
        else {
            DFS(L+1,score+list.get(L).score,time+list.get(L).time);
            DFS(L+1,score,time);
        }
    }

    public static void main(String[] args) {
        eightThreeRetry T = new eightThreeRetry();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(new Point16(a,b));
        }
        T.DFS(0,0,0);
        System.out.println(answer);
    }
}