package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class sevenThirteen {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v==n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv]==0) {
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        sevenThirteen T = new sevenThirteen();
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        graph= new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for (int i=0; i<m; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.print(answer);
    }
}
