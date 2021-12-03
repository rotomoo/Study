package InflearnAlgorithm;

import java.util.Scanner;

public class oneOneRetry {

    public int solution(String str,char cr) {
        int answer=0 ;
        str = str.toUpperCase();
        cr = Character.toUpperCase(cr);
        for (char x : str.toCharArray()) {
            if (x == cr) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        oneOneRetry T = new oneOneRetry();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char cr = scanner.next().charAt(0);
        System.out.println(T.solution(str,cr));
    }
}
