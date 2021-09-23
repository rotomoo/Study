package InflearnAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class sixTen {

    public int count(int[] arr, int dt) {
        int cnt=1;
        int ep=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i]-ep>=dt) {
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n,int c,int[] arr) {
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while (lt <= rt) {
            int mid=(lt+rt)/2;
            if (count(arr, mid)>=c) {
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        sixTen T = new sixTen();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.print(T.solution(n,c,arr));
    }
}
