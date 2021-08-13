package AlgorithmPractice;

import java.util.Scanner;

public class twoNine {

    public int solution(int num, int[][] numArr) {
        int answer=0;
        int sum1,sum2;
            for (int i=0;i<num;i++) {
                sum1=sum2=0;
                for (int j = 0; j < num; j++) {
                    sum1+=numArr[i][j];
                    sum2+=numArr[j][i];
                }
                answer=Math.max(answer,sum1);
                answer=Math.max(answer,sum2);
            }
            sum1=sum2=0;
            for (int i=0; i<num;i++) {
                sum1+=numArr[i][i];
                sum2+=numArr[i][num-i-1];
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
            return answer;
    }

    public static void main(String[] args) {
        twoNine T = new twoNine();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] numArr = new int[num][num];
        for (int i =0; i<num; i++) {
            for (int j=0; j<num; j++) {
                numArr[i][j]= scanner.nextInt();
            }
        }
        System.out.println(T.solution(num, numArr));
    }
}
