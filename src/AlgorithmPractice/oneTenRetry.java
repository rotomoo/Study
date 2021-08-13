package AlgorithmPractice;

import java.util.Scanner;

public class oneTenRetry {

    public int[] solution(String str, char c) {
        int[] answer= new int[str.length()];
        int cnt = 1000;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)==c) {
                cnt=0;
                answer[i] = cnt;
            } else {
                cnt++;
                answer[i] = cnt;
            }
        }
        cnt = 1000;
        for (int i=str.length()-1;i>=0;i--) {
            if (str.charAt(i)==c) {
                cnt=0;
                answer[i] = cnt;
            } else {
                cnt++;
                answer[i] = Math.min(answer[i], cnt);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        oneTenRetry T = new oneTenRetry();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
