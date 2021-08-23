package AlgorithmPractice;

import java.util.Scanner;
import java.util.Stack;

public class fiveThree {

    public int solution(int matrixNumber, int[][] board, int[] moveArr) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int pos: moveArr) {
            for (int i=0;i<matrixNumber;i++) {
                if (board[i][pos-1]!=0) {
                    int tmp=board[i][pos-1];
                    board[i][pos-1]=0;
                    if (!stack.isEmpty() && tmp==stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }
                    else {
                    stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveThree T = new fiveThree();
        Scanner scanner = new Scanner(System.in);
        int matrixNumber = scanner.nextInt();
        int[][] board = new int[matrixNumber][matrixNumber];
        for (int width=0;width<matrixNumber;width++) {
            for (int height=0;height<matrixNumber;height++) {
                board[width][height] = scanner.nextInt();
            }
        }
        int moveNumber = scanner.nextInt();
        int[] moveArr = new int[moveNumber];
        for (int width=0;width<moveNumber;width++) {
            moveArr[width] = scanner.nextInt();
        }
        System.out.print(T.solution(matrixNumber,board,moveArr));
    }
}
