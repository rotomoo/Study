package InflearnAlgorithm;

import java.util.Scanner;

public class oneTwoRetry {

    public String solution(String str) {
        String answer="";
        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer+= Character.toLowerCase(x);
            } else {
                answer+= Character.toUpperCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        oneTwoRetry T = new oneTwoRetry();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
