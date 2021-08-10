package basic;

import java.util.*;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("chicken", "닭");
        dictionary.put("pizza", "피자");
        dictionary.put("hippo", "하마");

        if (dictionary.isEmpty()) {
            System.out.println("단어가 없습니다.");
            System.exit(0);
        } else {
            System.out.println(dictionary.size() + "개의 단어가 있습니다.");
        }

        Set<Map.Entry<String, String>> entries = dictionary.entrySet();

        for (Map.Entry<String, String> entry : entries ) {
            String english = entry.getKey();
            String korean = entry.getValue();

            System.out.println(english + ":" + korean);
        }
    }
}
