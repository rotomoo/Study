package AlgorithmPractice;

import java.util.Scanner;

public class twoFive {

    public int solution(int num) {
        int answer=0;
        int[] numIndex = new int[num+1];
        for (int i=2; i<=num; i++) {
            if (numIndex[i]==0) {
                answer++;
                for (int j=i; j<=num; j=j+i) {
                    numIndex[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoFive T = new twoFive();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(T.solution(num));
    }
}
