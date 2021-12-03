package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class threeOneBest {

    public ArrayList<Integer> solution(int num, int[] numArr, int num2, int[] numArr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1<num && p2<num2) {
            if (numArr[p1]<numArr2[p2]) answer.add(numArr[p1++]);
            else answer.add(numArr2[p2++]);
        }
        while (p1<num) answer.add(numArr[p1++]);
        while (p2<num2) answer.add(numArr2[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        threeOneBest T = new threeOneBest();
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