package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("chicken" , "닭");
        dictionary.put("pizza" , "피자");
        dictionary.put("hippo" , "하마");

        if(dictionary.isEmpty()) {
            System.out.println("단어가 없습니다.");
            System.exit(0);
        } else {
            System.out.println(dictionary.size() + "개의 단어가 있습니다.");
        }

        Scanner scanner = new Scanner(System.in);
        String english = scanner.nextLine();
        String korean = dictionary.get(english);

        if (korean == null) {
            System.out.println("사전에 단어가 존재하지 않습니다.");
        } else
            System.out.println(korean);
    }
}
