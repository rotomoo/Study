package backjoon;

import java.util.*;

class testttt {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dy = new int[n+1];
//        Arrays.fill(dy, Integer.MAX_VALUE);
//        dy[1]=1;
//        if (n==1) {
//            System.out.print(1);
//            System.exit(0);
//        }
//        for (int i=2; i<=n; i++) {
//            if (i%3==0) dy[i] = Math.min(dy[i], dy[i-i/3*2] +1);
//            if (i%2==0) dy[i] = Math.min(dy[i], dy[i/2]+1);
//            dy[i] = Math.min(dy[i], dy[i-1] +1);
//        }
//        System.out.println(dy[n]);
//    }

    static int answer = Integer.MAX_VALUE;

    public static void DFS(int L, int cnt) {
        if (cnt >= answer) return;
        if (L == 0) {
            answer = Math.min(answer, cnt);
            return;
        }
        if (L%3==0) DFS(L - L/3*2, cnt+1);
        if (L%2==0) DFS(L/2, cnt+1);
        DFS(L-1, cnt+1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n, 0);
        System.out.println(answer);
    }
}