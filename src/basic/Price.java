package basic;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("메뉴를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input){
            case "치킨":
                System.out.println("치킨은 8천원 입니다.");
                break;
            case "순대국":
                System.out.println("순댓국은 9천원!");
                break;
            case "스테이크":
                System.out.println("스테이크는 5천원");
                break;
            default:
                System.out.println("없는메뉴");
                break;
        }
    }
}
