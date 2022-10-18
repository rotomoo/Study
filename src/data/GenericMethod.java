package data;

import java.util.ArrayList;
import java.util.List;

// 제네릭 클래스와 제네릭 메서드의 타입 매개변수가 같다면
public class GenericMethod<T> {

    // 타입 매개변수는 제네릭 메서드를 따라갑니다.
    public <T> void print(T t) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod<String> genericMethod = new GenericMethod<>();
        genericMethod.print(1); // java.lang.Integer
        genericMethod.print(0.1); // java.lang.Double
    }
}
