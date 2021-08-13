package AlgorithmPractice;

import java.util.Scanner;

public class oneTwelve {

    public String solution(int input, String str) {
        String answer="";
        for (int i = 0; i < input; i++) {
            String tmp =str.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer+=(char)num;
            str =str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        oneTwelve T = new oneTwelve();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(input, str));
    }
}