package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point11 implements Comparable<Point11> {
    int v1, v2, cost;

    Point11(int v1, int v2, int cost) {
        this.v1=v1;
        this.v2=v2;
        this.cost=cost;
    }

    @Override
    public int compareTo(Point11 o) {
        return this.cost-o.cost;
    }
}

class nineSevenStarStar {
    static int[] unf;

    public static int Find(int v) {
        if (v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa= Find(a);
        int fb= Find(b);
        if (fa!=fb) unf[fa]=fb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        unf = new int[n+1];
        ArrayList<Point11> list= new ArrayList<>();
        for (int i=1; i<=n; i++) unf[i]=i;
        for (int i=0; i<m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            list.add(new Point11(a, b, c));
        }
        int answer=0;
        Collections.sort(list);
        for (Point11 ob : list) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1!=fv2) {
                answer+=ob.cost;
                Union(ob.v1, ob.v2);
            }
        }
        System.out.print(answer);
    }
}
