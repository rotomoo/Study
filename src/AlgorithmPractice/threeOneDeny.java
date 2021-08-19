package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class threeOneDeny {

    public ArrayList<Integer> solution(int num, int[] numArr, int num2, int[] numArr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            answer.add(numArr[i]);
        }
        for (int i = 0; i < num2; i++) {
            answer.add(numArr2[i]);
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        threeOneDeny T = new threeOneDeny();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }
        int num2 = scanner.nextInt();
        int[] numArr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            numArr2[i] = scanner.nextInt();
        }
        for (int x : T.solution(num, numArr, num2, numArr2)) {
            System.out.print(x+" ");
        }
    }
}