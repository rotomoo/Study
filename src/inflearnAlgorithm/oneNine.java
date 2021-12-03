package InflearnAlgorithm;

import java.util.Scanner;

public class oneNine {

    public int solution(String str) {
        int answer=0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    public static void main(String[] args) {
        oneNine T = new oneNine();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
