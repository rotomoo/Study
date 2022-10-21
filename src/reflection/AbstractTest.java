package reflection;

abstract class AbstractClass {

    private String name;
    private String id;

    public AbstractClass() {
    }

    public AbstractClass(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract void foo();
}

public class AbstractTest extends AbstractClass {

    private String number;

    public AbstractTest(String name, String id, String number) {
        super(name, id);
        this.number = number;
    }

    @Override
    void foo() {

    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {

            @Override
            void foo() {

            }
        };
    }
}
