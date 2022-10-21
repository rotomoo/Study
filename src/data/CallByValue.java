package data;

import java.util.ArrayList;
import java.util.List;

public class CallByValue {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        Integer[] a = {10, 10, 10};
        int b = 1;

        System.out.println("firstList = " + firstList.get(0)); // firstList = [1]

        Add(firstList, a, b);

        System.out.println("firstList = " + firstList); // firstList = [1]

        for (Integer integer : a) {
            System.out.println("integer = " + integer);
        }
        // integer = 10
        // integer = 20
        // integer = 10

        System.out.println("b = " + b); // b = 1
    }

    public static void Add(List<Integer> list, Integer[] a, int b) {
        list.add(1);
        a[1] = 20;
        b = 3;
    }

}
