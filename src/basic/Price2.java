package basic;

import java.util.Scanner;

public class Price2 {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력하세요.");
        System.out.println("1. 치킨");
        System.out.println("2. 순대국");
        System.out.println("3. 스테이크");
        Scanner scanner = new Scanner(System.in);
        int menuNumber;

        try {
            menuNumber = scanner.nextInt();
        } catch (Exception e) {
            menuNumber = -1;
        }

        switch (menuNumber){
            case 1:
                System.out.println("치킨은 8천원 입니다.");
                break;
            case 2:
                System.out.println("순댓국은 9천원!");
                break;
            case 3:
                System.out.println("스테이크는 5천원");
                break;
            default:
                System.out.println("올바른 메뉴번호를 입력해주세요");
                break;
        }
    }
}
