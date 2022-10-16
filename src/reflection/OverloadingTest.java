package reflection;

class Overloading {

    private int id;
    private String name;

    // id 매개변수로 받는 생성자
    public Overloading(int id) {
        this.id = id;
    }

    // 생성자 오버로딩, id, name을 매개변수로 받음
    public Overloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 기본 생성자, 메서드 오버로딩을 위해 생성
    public Overloading() {
    }

    // id를 출력하는 say 메서드
    public void say() {
        System.out.println("id = " + id);
    }

    // 메서드 오버로딩, word를 매개변수로 받음
    public void say(String word) {
        System.out.println("id = " + id + " word = " + word);
    }

}

public class OverloadingTest {

    public static void main(String[] args) {
        
        // 생성자 오버로딩
        Overloading idOverloading = new Overloading(1);
        Overloading idNameOverloading = new Overloading(1, "병일");

        // 메서드 오버로딩
        idOverloading.say();
        idOverloading.say("hello");
    }

    //  결과
    //  id = 1
    //  id = 1 word = hello
}