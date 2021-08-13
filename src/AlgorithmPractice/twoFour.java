package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class twoFour {

    public ArrayList<Integer> solution(int num, int[] numArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        numArr[0] = 1;
        numArr[1] = 1;
        answer.add(1);
        answer.add(1);
        for (int i=2;i<num;i++) {
                answer.add(numArr[i]=numArr[i-1] + numArr[i-2]);
            }
        return answer;
    }

    public static void main(String[] args) {
        twoFour T = new twoFour();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int x : T.solution(num, numArr)) {
            System.out.print(x+" ");
        }
    }
}
