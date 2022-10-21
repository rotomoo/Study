package reflection;

class Galaxy {
    void call() {
    }
    void wifi() {
    }
}

public class User {
    Galaxy myphone = new Galaxy();

    void call() {
        myphone.call();
    }
    void wifi() {
        myphone.wifi();
    }
}
