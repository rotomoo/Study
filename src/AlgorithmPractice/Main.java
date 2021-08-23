package AlgorithmPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n,int m,int[] arr) {
        int answer=0;
        Arrays.sort(arr);
        for (int i=0;i<n;i++) {
            if (arr[i]==m) answer=i+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.print(T.solution(n,m,arr));
    }
}
