package AlgorithmPractice;

import java.util.Scanner;

public class oneEight {

    public String solution(String str) {
        String answer = "yes";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equals(tmp))
            return "No";
            return answer;
    }

    public static void main(String[] args) {
        oneEight T = new oneEight();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
