package programmers;

class QuadCompression {
    int[] answer;

    public void DFS(int len, int x, int y, int[][] arr) {
        if(len == 1) {
            answer[arr[x][y]]++;
            return;
        }

        if(isBlock(len, x, y, arr)) return;

        DFS(len/2, x, y, arr);
        DFS(len/2, x, y + len/2, arr);
        DFS(len/2, x + len/2, y, arr);
        DFS(len/2, x + len/2, y + len/2, arr);

    }

    public boolean isBlock(int len, int x, int y, int[][] arr) {
        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if(arr[x][y] != arr[i][j]) return false;
            }
        }

        answer[arr[x][y]]++;
        return true;
    }

    public int[] solution(int[][] arr) {
        answer = new int[2];
        DFS(arr.length, 0, 0, arr);
        return answer;
    }
}