package AlgorithmPractice;

import java.util.Arrays;
import java.util.Scanner;

public class sixFive {

    public String solution(int n, int[] arr) {
        String answer="U";
        Arrays.sort(arr);
        for (int i=0;i<n-1;i++) {
                if (arr[i]==arr[i+1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        sixFive T = new sixFive();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i]=scanner.nextInt();
        System.out.print(T.solution(n,arr));
    }
}
