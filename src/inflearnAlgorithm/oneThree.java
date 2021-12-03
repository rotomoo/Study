package InflearnAlgorithm;

import java.util.Scanner;

public class oneThree {

    public String solution(String str) {
        String answer="";
        int max=Integer.MIN_VALUE;
        String[] stringArrays = str.split(" ");
        for (String x : stringArrays) {
            int stringlength = x.length();
            if (stringlength>max) {
                max=stringlength;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        oneThree T = new oneThree();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(T.solution(inputString));
    }
}
