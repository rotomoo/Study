package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class threeTwoBest {

    public ArrayList<Integer> solution(int num, int[] numArr, int num2, int[] numArr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(numArr);
        Arrays.sort(numArr2);
        int p1=0, p2=0;
        while (p1<num && p2<num2) {
            if (numArr[p1]==numArr2[p2]){
                answer.add(numArr[p1++]);
                p2++;
            }
            else if (numArr[p1]>numArr2[p2]) p2++;
            else p1++;
        }
        return answer;
    }

    public static void main(String[] args) {
        threeTwoBest T = new threeTwoBest();
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