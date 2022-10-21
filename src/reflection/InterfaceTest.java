package reflection;

interface Person {
    public void foo();
    public void val();
}

public class InterfaceTest {

    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public void foo() {

            }

            @Override
            public void val() {

            }
        };
    }
}
