package AlgorithmPractice;

import java.util.Scanner;

public class twoEight {

    public int[] solution(int num, int[] numArr) {
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println(numArr[i]);
            int score = 1;
            for (int j = 0; j < num; j++) {
                if (numArr[i] < numArr[j]) score++;
            }
            answer[i] = score;
        }
        return answer;
    }

    public static void main(String[] args) {
        twoEight T = new twoEight();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int x : T.solution(num, numArr)) {
            System.out.print(x+" ");
        }
    }
}