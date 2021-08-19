package AlgorithmPractice;

import java.util.Scanner;

public class threeSix {

    public int solution(int countNumber, int change, int[] numberArr) {
        int answer = 0, left=0, count =0;
        for (int right=0; right<countNumber; right++) {
            if (numberArr[right]==0) {
                count++;
            }
            while (count>change) {
                if (numberArr[left]==0) {
                    count--;
                }
                left++;
            }
            answer=Math.max(answer,right-left+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        threeSix T = new threeSix();
        Scanner scanner = new Scanner(System.in);
        int countNumber = scanner.nextInt();
        int change = scanner.nextInt();
        int[] numberArr = new int[countNumber];
        for (int i = 0; i < countNumber; i++) {
            numberArr[i] = scanner.nextInt();
        }
            System.out.print(T.solution(countNumber, change, numberArr));
    }
}