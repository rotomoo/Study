package basic;

import java.util.Scanner;

/* a와 b를 입력받아서
* a의 b제곱승의 뒤에서 4째자리까지만 출력해라.*/



//5 5 -> 3125
//123 8 -> 2880

public class limitExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력a");
        String aString = scanner.nextLine();
        long a = Long.parseLong(aString);
        System.out.println("입력b");
        String bString = scanner.nextLine();
        long b = Long.parseLong(bString);
        System.out.println("a: " + a + "\n" + "b: " + b + "이며 a 는 b의 제곱승");
        long result = 1;

        for (long i=0; i < b; i++){
            result = result*a;
        }

        String result2 = Long.toString(result);
        String result3 = result2.substring(result2.length()-4, result2.length());
        System.out.println(result3);
    }
}