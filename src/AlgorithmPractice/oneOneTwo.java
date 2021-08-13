package AlgorithmPractice;

import java.util.Scanner;

public class oneOneTwo {
    public static void main(String[] args) {
        oneOneTwo T = new oneOneTwo();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char inputCharacter = scanner.next().charAt(0);
        System.out.println(T.solution(inputString,inputCharacter));
    }

    public int solution(String sinputString, char sinputCharacter) {
        int answer = 0;
        sinputString = sinputString.toUpperCase();
        sinputCharacter = Character.toUpperCase(sinputCharacter);

        for (char x : sinputString.toCharArray()) {
            if (sinputCharacter == x) answer ++;
        }
        return answer;
    }

}
