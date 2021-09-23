package InflearnAlgorithm;

import java.util.Scanner;

public class oneTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String answer ="";

        for (char x : input.toCharArray()) {
                if (Character.isLowerCase(x))
                    answer+= Character.toUpperCase(x);
             else
                answer+= Character.toLowerCase(x);
        }
        System.out.println(answer);
    }
}
