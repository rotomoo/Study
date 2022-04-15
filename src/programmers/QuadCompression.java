package programmers;

class QuadCompression {
    static int[][] Arr;
    static int[] answer = new int[2];

    public boolean isCheck(int L, int x, int y) {
        int num = Arr[x][y];
        for (int i = x; i < x+L; i++) {
            for (int j = y; j < y+L; j++) {
                if (num!=Arr[i][j]) return false;
            }
        }
        return true;
    }

    public void DFS(int L, int x, int y) {
        if (isCheck(L, x, y) || L==1) {
            answer[Arr[x][y]]++;
            return;
        }
        int newLen = L/2;
        DFS(newLen, x, y);
        DFS(newLen, x+newLen, y);
        DFS(newLen, x, y+newLen);
        DFS(newLen, x+newLen, y+newLen);
    }


    public int[] solution(int[][] arr) {
        Arr = arr;
        DFS(arr.length, 0, 0);
        return answer;
    }
}