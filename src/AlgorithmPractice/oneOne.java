package AlgorithmPractice;

import java.util.Scanner;

public class oneOne {

    public static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char x : str.toCharArray()) {
            if (x == c) answer ++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char inputCharacter = scanner.next().charAt(0);
        System.out.println(solution(inputString, inputCharacter));
    }
}
