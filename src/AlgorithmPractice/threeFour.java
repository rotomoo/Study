package AlgorithmPractice;

import java.util.Scanner;

public class threeFour {

    public int solution(int countNumber, int sum, int[] numberArr) {
        int answer = 0;
        int result = 0;
        int left = 0;
        for (int startIndex=0; startIndex<countNumber; startIndex++) {
            result+= numberArr[startIndex];
            if (result==sum) {
                answer++;
            } while (result>=sum) {
                result-=numberArr[left++];
                if (result==sum) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        threeFour T = new threeFour();
        Scanner scanner = new Scanner(System.in);
        int countNumber = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] numberArr = new int[countNumber];
        for (int i = 0; i < countNumber; i++) {
            numberArr[i] = scanner.nextInt();
        }
            System.out.print(T.solution(countNumber, sum, numberArr));
    }
}