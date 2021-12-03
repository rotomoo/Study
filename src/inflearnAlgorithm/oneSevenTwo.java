package InflearnAlgorithm;

import java.util.Scanner;

public class oneSevenTwo {

    public String solution(String str) {
        String answer="Yes";
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) return "no";
        return answer;
    }

    public static void main(String[] args) {
        oneSevenTwo T = new oneSevenTwo();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
