package reflection;

public class Dog extends Animal {

    private String name;
    private String ownerName;
    private int weight;
    private int ownerWeight;
    private int age;
    private int ownerAge;

    public Dog(String guestDogName, String guestName, int guestDogweight, int guestWeight, int guestDogAge, int gusetAge) {
        this.name = guestDogName;
        this.ownerName = guestName;
        this.weight = guestDogweight;
        this.ownerWeight = guestWeight;
        this.age = guestDogAge;
        this.ownerAge = gusetAge;
    }

    private void myCity(String city){
        System.out.println("myCity : " + city);
    }

    private void hello(){
        System.out.println("hello~");
    }
}
