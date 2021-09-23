package InflearnAlgorithm;

import java.util.Scanner;

public class oneTwelveRetry {

    public String solution(int cnt, String str) {
        String answer="";
        for (int i =0; i<cnt;i++) {
            String tmp = str.substring(0,7).replace("#","1").replace("*","0");
            str = str.substring(7);
            int num = Integer.parseInt(tmp,2);
            answer+=(char)num;
        }

        return answer;
    }

    public static void main(String[] args) {
        oneTwelveRetry T = new oneTwelveRetry();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(cnt, str));
    }
}
