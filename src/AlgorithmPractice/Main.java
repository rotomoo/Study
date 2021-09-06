package AlgorithmPractice;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i]>arr[j]) {
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr))
        System.out.print(x+" ");
    }
}