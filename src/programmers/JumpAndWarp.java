package programmers;

public class JumpAndWarp {

    public static int DFS(int L) {
        if (L==1 || L==2) return 1;
        if (L%2==1) return DFS((L - 1) / 2) + 1;
        else return DFS(L / 2);
    }

    public int solution(int n) {
        return DFS(n);
    }


//    static int N;
//    static int answer = Integer.MAX_VALUE;
//
//    public static void DFS(int L, int u) {
//        if (L > N) return;
//        if (u >= answer) return;
//        if (L == N) {
//            answer = Math.min(answer, u);
//        }
//        else {
//            DFS(L+1, u+1);
//            if (L!=0) DFS(L*2, u);
//        }
//    }
//
//    public int solution(int n) {
//        N = n;
//        DFS(0,0);
//        return answer;
//    }
}