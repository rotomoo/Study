package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathDfs10830 {
    static int[][] graph;
    static int n;

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] multi = new int[a.length][b[0].length];
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        multi[i][j] += a[i][k] * b[k][j];
                        multi[i][j] %= 1000;
                    }
                }
            }
        }
        return multi;
    }

    public static int[][] DFS(long b) {
        if (b==1) return graph;
        int[][] tmp = DFS(b / 2);
        tmp = multiply(tmp, tmp);
        if (b%2==1) {
            return multiply(tmp, graph);
        }
        return tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }
        int[][] answer = DFS(b);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}


//package backjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class MathDfs10830 {
//
//    static int MOD = 1000;
//    public static int N;
//    public static int[][] origin;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        N = Integer.parseInt(st.nextToken());
//        long B = Long.parseLong(st.nextToken());
//        origin = new int[N][N];
//        for(int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            for(int j = 0; j < N; j++) {
//                origin[i][j] = Integer.parseInt(st.nextToken()) % MOD;
//            }
//        }
//        int[][] result = pow(origin, B);
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < N; i++) {
//            for(int j = 0; j < N; j++) {
//                sb.append(result[i][j]).append(' ');
//            }
//            sb.append('\n');
//        }
//        System.out.println(sb);
//    }
//
//    public static int[][] pow(int[][] A, long exp) {
//        if(exp == 1L) return A;
//        int[][] ret = pow(A, exp / 2);
//        ret = multiply(ret, ret);
//        if(exp % 2 == 1L) {
//            ret = multiply(ret, origin);
//        }
//        return ret;
//    }
//
//    public static int[][] multiply(int[][] o1, int[][] o2) {
//        int[][] ret = new int[N][N];
//        for(int i = 0; i < N; i++) {
//            for(int j = 0; j < N; j++) {
//                for(int k = 0; k < N; k++) {
//                    ret[i][j] += o1[i][k] * o2[k][j];
//                    ret[i][j] %= MOD;
//                }
//            }
//        }
//        return ret;
//    }
//
//}
