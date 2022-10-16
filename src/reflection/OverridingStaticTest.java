package reflection;

class Basic {
    // 상위 클래스가 가지고 있는 메서드
    public void buy() {
        System.out.println("Basic");
    }
}

class SetDiscount extends Basic {
    // 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의합니다.
    public void buy() {
        System.out.println("Set");
    }
}

public class OverridingStaticTest {
    public static void main(String[] args) {
        // static이 없으면 SetDiscount 생성자로 생성하면 오버라이딩된 메서드를 호출합니다.
        // 그러나 static이 있으면 Basic의 static 메서드를 호출합니다.
        Basic basic = new SetDiscount();
        basic.buy();
    }
}