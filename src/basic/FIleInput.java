package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIleInput {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/basic/chicken.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        System.out.println(line);
        String line2 = scanner.nextLine();
        System.out.println(line2);
    }
}
