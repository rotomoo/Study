package data;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest {

    public static void main(String[] args) {
        Integer[] integerArr = {1, 2, 3};
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        printArr(integerArr);
        printList(integerList); // compile error!
    }

    public static void printArr(Object[] objectArr) {
        for (Object x : objectArr) {
            System.out.println(x);
        }
    }

    public static void printList(List<?> objectList) {
        for (Object x : objectList) {
            System.out.println(x);
        }
    }
}
