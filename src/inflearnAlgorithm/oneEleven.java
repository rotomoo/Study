package InflearnAlgorithm;

import java.util.Scanner;

public class oneEleven {

    public String solution(String str) {
        String answer="";
        str += " ";
        int cnt=1;
        for (int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer+=str.charAt(i) ;
                if (cnt>1) {
                    answer+=String.valueOf(cnt);
                    cnt=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        oneEleven T = new oneEleven();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
