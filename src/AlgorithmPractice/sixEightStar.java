package AlgorithmPractice;

import java.util.Scanner;
import java.util.Arrays;

public class sixEightStar {

    public int solution(int n, int m, int[] arr) {
        int answer = 0, lt=0, rt=n-1;
        Arrays.sort(arr);
        while (lt<=rt){
            int tmp=(rt+lt)/2;
            if (arr[tmp]>m) rt=tmp-1;
            else if (arr[tmp]<m) lt=tmp+1;
            else {
                answer=tmp+1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        sixEightStar T = new sixEightStar();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}