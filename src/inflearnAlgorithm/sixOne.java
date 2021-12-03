package InflearnAlgorithm;

import java.util.Scanner;

public class sixOne {

    public int[] solution(int num, int[] arr) {
        for (int i=0; i<num-1; i++) {
            int index=i;
            for (int j=i+1; j<num; j++) {
                if (arr[j]<arr[index]) index=j;
            }
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        sixOne T = new sixOne();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++) arr[i]=scanner.nextInt();
        for (int x : T.solution(num, arr)) {
            System.out.print(x+" ");
        }
    }
}
