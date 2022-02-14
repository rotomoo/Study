package programmers;

class BigSqure
{
    public int solution(int [][]board)
    {
        int answer = Integer.MIN_VALUE;
        if (board.length == 1 || board[0].length == 1) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j]==1) {
                    board[i][j] = Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1])) + 1;
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        return answer * answer;
    }
}
