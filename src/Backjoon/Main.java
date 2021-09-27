package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int[] unf;

    public static int Find(int v) {
        if (v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa!=fb) unf[fa]=fb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        unf = new int[n+1];
        for (int i=1; i<=n; i++) unf[i]=i;
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            Union(u,v);
        }
        for (int i=1; i<=n; i++) Find(i);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=1; i<=n;i++) {
            map.put(unf[i], map.getOrDefault(unf[i],0)+1);
        }
        System.out.print(map.size());
        /*Arrays.sort(unf);
        int answer=1;
        for (int i=2; i<=n;i++) {
            if (unf[i]!=unf[i-1]) answer++;
        }
        System.out.print(answer);*/
    }
}