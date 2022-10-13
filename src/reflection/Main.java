package reflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        // 생성자로 annotationClass 인스턴스를 생성합니다.
        AnnotationClass annotationClass = new AnnotationClass();

        // annotationClass 인스턴스의 .getClass()메서드를 사용해 클래스를 찾습니다.
        Class cls = annotationClass.getClass();

        // 찾은 cls클래스에서 .getMethod()를 사용해 annotationMethod를 가져옵니다.
        Method annotationMethod = cls.getMethod("annotationMethod");

        // 가져온 annotationMethod에서 getAnnotation()을 사용해 인자로 TestAnnotation.class를 전달하여 testAnnotation을 가져옵니다.
        TestAnnotation testAnnotation = annotationMethod.getAnnotation(TestAnnotation.class);

        String value = testAnnotation.value();
        String[] produces = testAnnotation.produces();

        System.out.println("value = " + value);
        System.out.println("produces = " + produces[0]);
    }
}

// >> 결과
//        value = /Cumtom-Annotation-Test
//        produces = jsonType