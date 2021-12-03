package InflearnAlgorithm;

import java.util.Scanner;

public class twoFourThree {

    public void solution(int num) {
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
            for (int i=2;i<num;i++) {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
    }

    public static void main(String[] args) {
        twoFourThree T = new twoFourThree();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        T.solution(num);
        }
}
