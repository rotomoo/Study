package InflearnAlgorithm;

import java.util.Scanner;

public class oneNineTwo {

    public int solution(String str) {
        String answer="";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer+=x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        oneNineTwo T = new oneNineTwo();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
