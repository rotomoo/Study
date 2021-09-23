package InflearnAlgorithm;

import java.util.Scanner;

class threeThree {
    public int solution(int n, int m, int[] arr) {
        int answer=0, max=0, lt=0;
        for (int i=0; i<m; i++) {
            max+=arr[i];
        }
        answer=max;
        for (int rt=m; rt<n; rt++) {
            max=max-arr[lt]+arr[rt];
            answer=Math.max(max,answer);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        threeThree T = new threeThree();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}