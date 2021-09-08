package AlgorithmPractice;

import java.util.Scanner;
import java.util.Arrays;

public class sixTenStar {

    public int count(int[] arr, int dis) {
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++) {
            if (arr[i]-ep>=dis) {
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0, lt=1, rt=Arrays.stream(arr).max().getAsInt()-1;
        Arrays.sort(arr);
        while (lt<=rt) {
            int mid = (lt+rt)/2;
            if (count(arr, mid)>=c) {
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        sixTenStar T = new sixTenStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, c, arr));
    }
}