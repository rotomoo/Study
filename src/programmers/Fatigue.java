package programmers;

class Fatigue {
    static int len, answer = Integer.MIN_VALUE;
    static int[][] dungeonsTmp;
    static int[] ch;

    public static void DFS(int L, int ret, int result) {
        if (L == len) {
            answer = Math.max(answer, result);
            return;
        }
        for (int i = 0; i < len; i++) {
            if (ch[i] == 0) {
                ch[i] = 1;
                if (ret >= dungeonsTmp[i][0]) DFS(L+1, ret - dungeonsTmp[i][1], result+1);
                else DFS(L+1, ret, result);
                ch[i] = 0;
            }
        }
    }

    public int solution(int k, int[][] dungeons) {
        len = dungeons.length;
        ch = new int[len];
        dungeonsTmp = dungeons;
        DFS(0, k, 0);
        return answer;
    }
}