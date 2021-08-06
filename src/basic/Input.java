package basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input);
    }
}