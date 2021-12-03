package InflearnAlgorithm;

import java.util.Scanner;

public class oneSix {

    public String solution(String str) {
        String answer="";
        for (int i = 0; i<str.length(); i++) {
            //System.out.println(str.charAt(i) +" "+i+" "+str.indexOf(str.charAt(i)));//
            if (str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        oneSix T = new oneSix();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
