package InflearnAlgorithm;

import java.util.Scanner;

public class oneTwoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String answer ="";

        for (char x : input.toCharArray()) {
            if (x>=97)
                answer+= (char)(x-32);
            else
                answer+= (char)(x+32);
        }
        System.out.println(answer);
    }
}
