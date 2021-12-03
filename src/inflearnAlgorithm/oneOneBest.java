package InflearnAlgorithm;

import java.util.Scanner;

public class oneOneBest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char inputCharacter = scanner.next().charAt(0);
        inputString = inputString.toUpperCase();
        inputCharacter = Character.toUpperCase(inputCharacter);
        int answer = 0;

        /*
        for (char x  : inputString.toCharArray()) {
            if (x == inputCharacter) answer ++;
        }
        */

        for (int i = 0; i < inputString.length(); i++) {
            if (inputCharacter == inputString.charAt(i)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
