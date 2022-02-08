package programmers;

class Fibo {
    static int[] ch;

    public static int DFS(int v) {
        if (ch[v]!=0) return ch[v];
        if (v==0) return ch[v] = 0;
        else if (v==1) return ch[v] = 1;
        else return ch[v] = (DFS(v - 2) + DFS(v - 1)) % 1234567;
    }

    public int solution(int n) {
        int answer = 0;
        ch = new int[n+1];
        return DFS(n);
    }

//    public int solution(int n) {
//        int[] dy = new int[n+1];
//        dy[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dy[i] = (dy[i - 2] + dy[i - 1])% 1234567;
//        }
//        return dy[n] % 1234567;
//    }
}