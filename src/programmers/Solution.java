package programmers;

class Solution {
    static int n, Number;
    static int answer = Integer.MAX_VALUE;
    public static void DFS(int L, int num) {
        if (L > 8) return;
        if (L >= answer) return;
        if (num == Number) {
            answer = Math.min(answer, L);
            return;
        }
        DFS(L+1, num+n);
        DFS(L+1, num-n);
        DFS(L+1, num*n);
        DFS(L+1, num/n);
    }

    public static int solution(int N, int number) {
        n = N;
        Number = number;
        for (int i = 0; i <= 8; i++) {
            String num = String.valueOf(N).repeat(i);
            if (num.equals("")) {
                DFS(0, 0);
            }
            else {
                DFS(0+i, Integer.parseInt(num));
            }
        }
        if (answer==Integer.MAX_VALUE) return -1;
        else return answer;
    }
}