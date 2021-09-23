package InflearnAlgorithm;

import java.util.Scanner;

public class twoTwo {

    public int solution(int num, int[] numArr) {
        int answer=1;
        int max=numArr[0];
        for(int i=1;i<num;i++) {
            if (numArr[i]>max) {
                answer++;
                max=numArr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoTwo T = new twoTwo();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i=0;i<num;i++)
        {
            numArr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(num, numArr));
    }
}
