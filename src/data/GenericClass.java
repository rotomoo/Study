package data;

/*class User {
}

class Admin {
}

class Member{
    public Object name;

    public Member(Object name) {
        this.name = name;
    }

    public Object getName() {
        return name;
    }
}

public class GenericClass{
    public static void main(String[] args) {

        Member member = new Member(new User());
        User user = (User)member.getName();
        // 문법적으로 오류가 없어 컴파일 에러 발생 X, 그러나 런타임 에러 발생
        Admin admin = (Admin)member.getName();
    }
}

// Exception in thread "main" java.lang.ClassCastException: class data.User cannot be cast to class data.Admin (data.User and data.Admin are in unnamed module of loader 'app') at data.GenericClass.main(GenericClass.java:27)

// 런타임에서 오류가 발생하여 어디서 오류인지 찾기가 힘들다.*/

class User {
}

class Admin extends User {
}

class Member<T extends User>{
    public T name;

    public Member(T name) {
        this.name = name;
    }

    public Member() {
    }

    public T getName() {
        return name;
    }
}

public class GenericClass{
    public static void main(String[] args) {

        // 제네릭을 사용하여 User타입 인스턴스 생성
        Member<User> userMember = new Member<>();
        Member<Admin> adminMember = new Member<>();

        User user = userMember.getName();



//        Member<User> member = new Member<>();
//
//        User user2 = member.getName();
        // 제네릭을 사용하여 member.getName()의 리턴 타입은 User인데
        // Admin 잘못된 타입이 들어온것을 감지, 컴파일 에러 발생
//        Admin admin = member.getName();
    }
}

// 타입 안정성 증가