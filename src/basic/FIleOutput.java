package basic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FIleOutput {
    public static void main(String[] args) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/basic/output01.txt", true);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패하였습니다.");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("종료하려면 입력없이 엔터.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("종료");
                break;
            }

            try {
                writer.write(input + "\n");
            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는데에 실패하였습니다.");
                System.exit(2);
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 닫기에 실패하였습니다.");
        }
    }
}
