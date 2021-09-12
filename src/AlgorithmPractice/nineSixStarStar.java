package AlgorithmPractice;

import java.util.Scanner;

class nineSixStarStar {
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
        nineSixStarStar T = new nineSixStarStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        unf =new int[n+1];
        for (int i=1; i<=n; i++) unf[i]=i;
        for (int i=1; i<=m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Union(a,b);
        }
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int fa=Find(a);
        int fb=Find(b);
        if (fa==fb) System.out.print("YES");
        else System.out.print("NO");
    }
}
