package obejectOriented;


class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    Person(String name, int age, int height, int weight) {
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("이동중..");
    }
}

class Villain extends Person {
    private String id;
    private int weapon;
    private double power;

    Villain(String name, int age, int height, int weight, String id, int weapon, double power) {
        super(name,age,height,weight);
        this.id=id;
        this.weapon=weapon;
        this.power=power;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void printPerson() {
        System.out.println("--------------------------------------");
        System.out.println("악당 이름:" + getName());
        System.out.println("악당 나이:" + getAge());
        System.out.println("악당의 키:" + getHeight());
        System.out.println("악당 체중:" + getWeight());
        System.out.println("악당 넘버:" + getId());
        System.out.println("악당 무기:" + getWeaponName(getWeapon())); // 숫자(1~9) --> 1:창, 2:방패, 3:총..
        System.out.println("악당 파워:" + getPower());
        System.out.println("--------------------------------------");
    }

    public String getWeaponName(int a) {
        String weapon;
        switch (a) {
            case 1:
                weapon="창";
                break;
            case 2:
                weapon="방패";
                break;
            case 3:
                weapon="총";
                break;
            default:
                weapon="---";
                break;
        }
        return weapon;
    }
}

class Hero extends Person {

    Hero(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        // 객체 생성
        Villain v1 = new Villain("좀비",20,180,80,"1568468153",2,99.5);
        v1.printPerson();
        System.out.print(v1.getName()+" ");
        v1.move();

        // 객체 생성
        Villain v2 = new Villain("도깨비",30,180,80,"1568468153",1,99.5);
        v2.printPerson();
        System.out.print(v2.getName()+" ");
        v2.move();
    }
}
