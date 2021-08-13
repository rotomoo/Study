package AlgorithmPractice;

import java.util.Scanner;

public class oneTen {

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for (int j = s.length()-1; j >= 0; j--) {
            System.out.println(j);
            if (s.charAt(j) == t) {
                p = 0;
            } else {
                p++;
                answer[j] = Math.min(answer[j], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        oneTen T = new oneTen();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}