package InflearnAlgorithm;

import java.util.Scanner;

class tenThreeStarStar {
    static int[] dy;
    public int solution(int n,int[] arr) {
        int answer=0;
        dy[0]=1;
        for (int i=1; i<n; i++) {
            int max=0;
            for (int j=i-1; j>=0; j--) {
                if (arr[i]>arr[j] && dy[j]>max) max=dy[j];
            }
            dy[i]=max+1;
            answer=Math.max(answer,dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        tenThreeStarStar T = new tenThreeStarStar();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr= new int[n];
        dy= new int[n];
        for (int i=0; i<n; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.print(T.solution(n,arr));
    }
}