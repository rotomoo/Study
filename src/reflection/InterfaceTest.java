package reflection;

interface Operate {
    int tmp = 1;

    int operate(int a, int b);

    boolean equals(Object obj);

    default void print() {
        System.out.println("print");
    }

    static void print2() {
        System.out.println("print2");
    }
}


public class InterfaceTest {

    public static void main(String[] args) {
        Operate lambdaOperate = (int a, int b) -> a + b;
        System.out.println(lambdaOperate.operate(3, 5));
    }

//    public static void main(String[] args) {
//        System.out.println(new Operate() {
//            @Override
//            public int operate(int a, int b) {
//                return a + b;
//            }
//        }.operate(3, 5));
//    }
}


//interface Person {
//    public void operate();
//    public void val();
//}
//
//public class InterfaceTest {
//
//    public static void main(String[] args) {
//        Person person = new Person() {
//            @Override
//            public void foo() {
//
//            }
//
//            @Override
//            public void val() {
//
//            }
//        };
//    }
//}
