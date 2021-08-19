package AlgorithmPractice;

import java.util.Scanner;

public class twoEleven {

    public int solution(int num, int[][] numArr) {
        int answer=0;
        int max=Integer.MIN_VALUE;
        for (int i=1;i<=num;i++) {
            int cnt=0;
            for (int j=1;j<=num;j++) {
                for (int k=1;k<=5;k++) {
                    if (numArr[i][k]==numArr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt>max) {
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoEleven T = new twoEleven();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numArr[][] = new int[num+1][6];
        for (int i =1;i<=num;i++) {
            for (int j=1;j<=5;j++) {
                numArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(num, numArr));
    }
}
