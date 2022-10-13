package reflection;

import java.lang.reflect.Field;

// DI를 담당하는 class입니다.
public class DependencyInjection {

    // 특정 타입의 클래스를 매개변수로 받아 그 타입을 반환하는 메서드입니다.
    public static <T> T getInstance(Class<T> cls) throws Exception {
        // 매개변수로 받은 cls클래스를 인자로, createInstance 메서드에 전달해 클래스 타입에 맞는 인스턴스를 생성합니다.
        T instance = createInstance(cls);
        // 매개변수로 받은 cls클래스의 필드들을 가져옵니다.
        Field[] Fields = cls.getDeclaredFields();

        for (Field field : Fields) {
            // 클래스의 필드들을 순회하면서 @Autowired(=Autowired.class) 어노테이션이 있다면
            if (field.getAnnotation(Autowired.class) != null) {
                // 해당 필드의 접근 제어자가 private일수도 있으므로 .setAccessible(true) 메서드를 이용해 접근을 허용하고
                field.setAccessible(true);
                // 해당 필드의 타입에 맞는 인스턴스를 생성합니다.
                Object fieldInstance = createInstance(field.getType());
                // 생성한 fieldInstance를 해당 필드에 주입합니다.
                field.set(instance, fieldInstance);
            }
        }
        return instance;
    }

    private static <T> T createInstance(Class<T> cls) throws Exception {
        // 클래스의 생성자를 가져와서 .newInstance() 메서드를 사용해 인스턴스를 리턴
        return cls.getConstructor(null).newInstance();
    }
}
