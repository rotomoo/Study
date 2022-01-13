package inflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Point5 {
    public int x, y;
    public Point5(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class eightFifteen {
    static int n, m, len, answer=Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point5> hs, pz;

    public void DFS(int L, int s) {
        if (L==m){
            int sum=0;
            for (Point5 h : hs) {
                int dis=Integer.MAX_VALUE;
                for (int i : combi) {
                    dis=Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
                }
                sum+=dis;
            }
            answer=Math.min(sum,answer);
        }
        else {
            for (int i=s; i<len; i++) {
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        eightFifteen T = new eightFifteen();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        hs=new ArrayList<>();
        pz=new ArrayList<>();
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp=scanner.nextInt();
                if (tmp==1) hs.add(new Point5(i,j));
                else if (tmp==2) pz.add(new Point5(i,j));
            }
        }
        len=pz.size();
        combi=new int[m];
        T.DFS(0,0);
        System.out.println(answer);
    }
}
