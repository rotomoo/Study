package reflection;

public class AnnotationClass {
    @TestAnnotation(value = "/Cumtom-Annotation-Test", produces = "jsonType")
    public void annotationMethod() {
        System.out.println("Testing Method");
    }
}