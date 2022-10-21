package data;

import java.util.ArrayList;

public class Boxing {

    static class Point {
        private final int value;

        public Point(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
//        // 박싱
//        Integer a = new Integer(5);
//
//        // 언박싱
//        int b = a.intValue();
//
//        // 오토 박싱
//        Integer c = 5;
//
//        // 오토 언박싱
//        int d = c;

        int a = 5;
        Integer b = new Integer(5);
        Integer c = new Integer(5);
        Integer d = new Integer(6);

        // true, 원시 타입과 래퍼 클래스와의 비교는 == 연산과 equals연산 모두 가능합니다. 컴파일러가 자동으로 오토박싱과 언박싱을 해주기 때문입니다.
        System.out.println(a==b);

        // true, 원시 타입과 래퍼 클래스와의 비교는 == 연산과 equals연산 모두 가능합니다. 컴파일러가 자동으로 오토박싱과 언박싱을 해주기 때문입니다.
        System.out.println(b.equals(a));

        // false, 래퍼 클래스는 객체이므로 동등 연산자(==)를 사용하게 되면, 두 인스턴스의 값을 비교하는 것이 아니라 두 인스턴스의 주소값을 비교하게 됩니다.
        System.out.println(b==c);

        // true, String, Integer등 모든 객체는 equals 메소드를 사용할 수 있습니다.
        System.out.println(b.equals(c));

        // false, 래퍼 클래스의 비교 연산은 오토 언박싱을 통해 가능해집니다.
        System.out.println(c>d);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(1));
        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(0).equals(list.get(1)));
        System.out.println(list.get(0));

        Integer e = 1;
        Integer f = 1;
        System.out.println(e==f);

        Integer g = 128;
        Integer h = 128;
        System.out.println(g==h);

    }
}
