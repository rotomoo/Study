package InflearnAlgorithm;

import java.util.Scanner;

public class sixThree {

    public int[] solution(int num, int[] arr) {
        for (int i=1; i<num; i++) {
            int tmp=arr[i], j;
            for (j=i-1;j>=0;j--) {
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        sixThree T = new sixThree();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++) arr[i]=scanner.nextInt();
        for (int x : T.solution(num, arr)) {
            System.out.print(x+" ");
        }
    }
}
