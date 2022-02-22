package programmers;

class QuadCompression {
    static int[] answer;
    static int[][] arrTmp;

    public static void DFS(int len, int x, int y) {
        if (isBlock(len, x, y) || len == 1) {
            answer[arrTmp[x][y]]++;
            return;
        }
        DFS(len / 2, x, y);
        DFS(len / 2, x + len / 2, y);
        DFS(len / 2, x, y + len / 2);
        DFS(len / 2, x + len / 2, y + len / 2);
    }

    public static boolean isBlock(int len, int x, int y) {
        for (int i = x; i < len + x; i++) {
            for (int j = y; j < len + y; j++) {
                if (arrTmp[x][y] != arrTmp[i][j]) return false;
            }
        }
        return true;
    }

    public int[] solution(int[][] arr) {
        answer = new int[2];
        arrTmp = arr;
        DFS(arr.length, 0, 0);
        return answer;
    }
}