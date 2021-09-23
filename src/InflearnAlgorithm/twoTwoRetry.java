package InflearnAlgorithm;

import java.util.Scanner;

public class twoTwoRetry {

    public int solution(int num,int[] numArr) {
        int answer =1;
        int max=numArr[0];
        for (int i=1; i<num; i++) {
            if (numArr[i]>max) {
                answer++;
                max=numArr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoTwoRetry T = new twoTwoRetry();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i=0; i<num; i++) {
            numArr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(num,numArr));
    }
}
