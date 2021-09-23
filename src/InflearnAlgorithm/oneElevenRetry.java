package InflearnAlgorithm;

import java.util.Scanner;

public class oneElevenRetry {

    public String solution(String str) {
        String answer="";
        str= str+" ";
        int cnt=1;
            for (int i=0;i < str.length()-1;i++) {
                if (str.charAt(i)==str.charAt(i+1)) {
                    cnt++;
                } else {
                    answer+=str.charAt(i);
                    if (cnt>1) {
                        answer+=String.valueOf(cnt);
                        cnt=1;
                    }
                }
            }
        return answer;
    }

    public static void main(String[] args) {
        oneElevenRetry T = new oneElevenRetry();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
