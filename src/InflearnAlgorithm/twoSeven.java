package InflearnAlgorithm;

import java.util.Scanner;

public class twoSeven {

    public int solution(int num,int[] numArr) {
        int answer=0;
        int score =0;
        for (int i=0; i<num; i++) {
            if (numArr[i]==1) {
                score++;
                answer+=score;
                } else {
                    score=0;
                }
            }
        return answer;
    }

    public static void main(String[] args) {
        twoSeven T = new twoSeven();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i=0; i<num; i++) {
            numArr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(num,numArr));
    }
}