package InflearnAlgorithm;

import java.util.Scanner;

public class oneSeven {

    public String solution(String str) {
        String answer="Yes";
        str=str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        oneSeven T = new oneSeven();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
