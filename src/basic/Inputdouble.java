package basic;

import java.util.Scanner;

public class Inputdouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요");
        String exchnageString = scanner.nextLine();
        System.out.println("치킨값을 입력하세요");
        String priceString = scanner.nextLine();
        double exchangeValue = Double.parseDouble(exchnageString);
        double priceValue = Double.parseDouble(priceString);
        System.out.println("치킨값은 " + priceValue / exchangeValue + "달러입니다.");
    }
}
