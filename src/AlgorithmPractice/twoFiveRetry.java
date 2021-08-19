package AlgorithmPractice;

import java.util.Scanner;

public class twoFiveRetry {

    public int solution(int num) {
        int answer=0;
        int[] cnt=new int[num+1];
        for (int i=2;i<=num; i++) {
            if (cnt[i] == 0) {
                answer++;
                for (int j=i;j<=num;j=j+i) {
                    cnt[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoFiveRetry T = new twoFiveRetry();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(T.solution(num));
        }
}
