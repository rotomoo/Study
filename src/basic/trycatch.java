package basic;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요");
        String exchnageString = scanner.nextLine();
        try {
            double exchangeValue = Double.parseDouble(exchnageString);
            System.out.println("달러환율은 " + exchangeValue + "입니다.");
        } catch (Exception e){
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}
