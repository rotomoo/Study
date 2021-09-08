package AlgorithmPractice;

import java.util.Scanner;

public class answer2 {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        return answer;
    }


    public static void main(String[] args) {
        answer2 T = new answer2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}