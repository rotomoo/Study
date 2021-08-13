package AlgorithmPractice;

import java.util.Scanner;

public class oneThreeTwo {

    public String solution(String str) {
        String answer="";
        int max=Integer.MIN_VALUE;
        int pos;
        while ((pos=str.indexOf(' '))!=-1) {
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if (len>max) {
                max=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if (str.length()>max) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        oneThreeTwo T = new oneThreeTwo();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(T.solution(inputString));
    }
}
