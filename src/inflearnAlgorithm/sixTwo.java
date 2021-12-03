package InflearnAlgorithm;

import java.util.Scanner;

public class sixTwo {

    public int[] solution(int num, int[] arr) {
        for (int i=0; i<num-1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        sixTwo T = new sixTwo();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++) arr[i]=scanner.nextInt();
        for (int x : T.solution(num, arr)) {
            System.out.print(x+" ");
        }
    }
}
