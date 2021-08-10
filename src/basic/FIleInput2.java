package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIleInput2 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/basic/acronym.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
