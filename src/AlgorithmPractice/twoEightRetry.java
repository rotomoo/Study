package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class twoEightRetry {

    public ArrayList<Integer> solution(int num, int[] numArr) {
        ArrayList<Integer> answer=new ArrayList<>();
        for (int i=0; i<num; i++) {
            int score = 1;
            for (int j=0; j<num; j++) {
                if (numArr[i]<numArr[j]) {
                    score++;
                }

            }
            answer.add(i,score);
        }
        return answer;
    }

    public static void main(String[] args) {
        twoEightRetry T = new twoEightRetry();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i=0; i<num; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int x : T.solution(num, numArr)) {
            System.out.println(x);
        }
    }
}
