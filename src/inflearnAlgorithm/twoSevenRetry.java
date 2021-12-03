package InflearnAlgorithm;

import java.util.Scanner;

public class twoSevenRetry {

    public int solution(int num, int[] numArr) {
        int answer=0;
        int cnt =0;
        for (int i=0; i<num; i++) {
            if (numArr[i]==1) {
                cnt++;
                answer+=cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        twoSevenRetry T = new twoSevenRetry();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i=0; i<num; i++) {
            numArr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(num, numArr));
    }
}
