package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLoopEx {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("치킨");
        foods.add("피자");
        foods.add("햄버거");

        if (foods.size() == 0) {
            System.out.println("목록이 비어있습니다.");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다.");
        }
    }
}
