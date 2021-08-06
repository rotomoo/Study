package basic;

import java.util.Scanner;

public class Inputint {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        System.out.println(intInput + 1);
    }
}
