package basic;

import java.util.Scanner;

public class Inputint2 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        System.out.println(intValue + 1);
    }
}
