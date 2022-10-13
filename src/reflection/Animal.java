package reflection;

public class Animal {
    public String name = "myName ?";
    private String city = "myCity ?";

    private void sleep(){
        System.out.println("sleep");
    }

    private void eat(String x){
        System.out.println("eat : " + x);
    }

    private void walk(){
        System.out.println("walk");
    }
}
