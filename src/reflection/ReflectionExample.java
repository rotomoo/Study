package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
//        Class cls = Dog.class;
//        System.out.println("cls.getName() = " + cls.getName());
        // 출력 : cls.getName() = reflection.Dog

//        Class cls = Class.forName("reflection.Dog");
//        System.out.println("cls.getName() = " + cls.getName());
        // 출력 : cls.getName() = reflection.Dog

        Class cls = Class.forName("reflection.Dog");
        Constructor constructor = cls.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object dog2 = constructor.newInstance();
        System.out.println("dog2 = " + dog2);
        // 출력 : dog2 = reflection.Dog@6aaa5eb0
    }


}
