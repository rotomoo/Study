package basic;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("0~99까지의 숫자를 맞춰보세요");

        Random random = new Random();
        int randomNuber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 8; i++) {
            System.out.println(8 - i + "번의 기회가 남았습니다. ");
            System.out.println("숫자를 입력해주세요");
            int inputNumber = scanner.nextInt();

            if (randomNuber > inputNumber) {
                System.out.println("업!");
            }

            else if (randomNuber < inputNumber) {
                System.out.println("다운!");
            }

            else {
                System.out.println("정답입니다.");
                break;
            }

            if (i == 7) {
                System.out.println("기회가 없습니다.");
            }   
        }
        System.out.println("종료");
    }
}