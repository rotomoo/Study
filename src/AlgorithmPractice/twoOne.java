package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class twoOne {

    public ArrayList<Integer> solution(int num, int[] numArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(numArr[0]);
        for (int i = 1; i < num; i++) {
            if (numArr[i] > numArr[i-1]) {
                answer.add(numArr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoOne T = new twoOne();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i=0;i<num;i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int x : T.solution(num, numArr)) {
            System.out.print(x+" ");
        }
    }
}
