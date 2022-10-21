package data;

class CustomObject {
    int x, y;

    public CustomObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class SameTest {
    public static void main(String[] args) {
        CustomObject customObject = new CustomObject(1, 2);
        CustomObject customObject2 = new CustomObject(1, 2);
        CustomObject customObject3 = customObject;


        System.out.println(customObject == customObject2); // false
        System.out.println(customObject == customObject3); // true
        System.out.println(customObject2 == customObject3); // false
        System.out.println();
        System.out.println(customObject.equals(customObject2)); // false
        System.out.println(customObject.equals(customObject3)); // true
        System.out.println(customObject2.equals(customObject3)); // false
    }
}