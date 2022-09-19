package programmers2;

// 이건.. B를 어떻게 표현해야하지? 어렵다..
class ThreePointSolution3 {
    static char[][] map;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public char[][] findMine(int x, int y) {
        char[][] answer = map.clone();
        if (map[x][y] == 'M') {
            answer[x][y] = 'X';
        }
        else {
            boolean haveMine = false;
            int mineCnt = 0;
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (in(nx, ny) && map[nx][ny] == 'M') {
                    haveMine = true;
                    mineCnt++;
                }
            }
            if (haveMine) {
                answer[x][y] = (char)(mineCnt +'0');
            }
            else {
                answer = findNumber();
            }
        }
        return answer;
    }

    public char[][] findNumber() {
        char[][] answer = map.clone();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'M') {
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (in(nx, ny) && map[nx][ny] == 'M') continue;
                        else if (in(nx, ny) && Character.isDigit(map[ny][nx])) map[nx][ny] += 1;
                        else if (in(nx, ny) && Character.isAlphabetic(map[ny][nx])) map[nx][ny] = (char)(1+'0');
                    }
                }
            }
        }
        return answer;
    }

    public String[] solution(String[] board, int y, int x) {
        map = new char[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                map[i][j] = board[i].charAt(j);
            }
        }
        char[][] answerMap = findMine(y, x);
        String[] answer = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            answer[i] = new String(answerMap[i]);
        }
        return answer;
    }

    public boolean in(int nx, int ny) {
        if (nx >= 0 && ny >= 0 && nx < map.length && ny <map[0].length) return true;
        return false;
    }
}