package basic;

import java.util.Scanner;

public class WhileBreakPassword {
    public static void main(String[] args) {
        String password = "asd123";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("비밀번호를 입력해주세요");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("로그인.");
                break;
            }
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}