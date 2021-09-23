package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Point19 {
    int x, y;
    Point19(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class eightFifteenStarStar {
        static int n, m, len , answer=Integer.MAX_VALUE;
        static int[] combi;
        static ArrayList<Point19> hs, pz;
        public int DFS(int L, int s) {
        if (L==m) {
            int sum=0;
            for (Point19 h : hs) {
                int dis=Integer.MAX_VALUE;
                for (int i : combi) {
                    dis=Math.min(dis,Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
                }
                sum+=dis;
            }
            answer=Math.min(answer,sum);
        }
        else {
            for (int i=s; i<len; i++) {
                combi[L]=i;
                DFS(L+1,i+1);
            }
        }
        return L;
    }

    public static void main(String[] args) {
        eightFifteenStarStar T = new eightFifteenStarStar();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][n];
        hs=new ArrayList<>();
        pz=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] =scanner.nextInt();
                if (arr[i][j]==1) hs.add(new Point19(i,j));
                if (arr[i][j]==2) pz.add(new Point19(i,j));
            }
        }
        len=pz.size();
        combi=new int[m];
        T.DFS(0,0);
        System.out.print(answer);
    }
}