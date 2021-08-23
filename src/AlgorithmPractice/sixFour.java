package AlgorithmPractice;

import java.util.Scanner;

public class sixFour {

    public int[] solution(int s, int n, int[] arr) {
        int[] cache= new int[s];
        for (int x : arr) {
            int pos=-1;
            for (int i=0;i<s;i++) {
                if (x==cache[i]) pos=i;
            }
            if (pos==-1) {
                for (int i=s-1;i>=1;i--) {
                    cache[i]=cache[i-1];
                }
            }
            else {
                for (int i=pos;i>=1;i--) {
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }

    public static void main(String[] args) {
        sixFour T = new sixFour();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i]=scanner.nextInt();
        for (int x : T.solution(s,n,arr)) {
            System.out.print(x+" ");
        }
    }
}
