package data;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Point main = new Point(1, 2);
        Point main2 = new Point(1, 2);
        Point main3 = main;


        System.out.println(main == main2); // false
        System.out.println(main == main3); // true
        System.out.println(main2 == main3); // false
        System.out.println();
        System.out.println(main.equals(main2)); // false
        System.out.println(main.equals(main3)); // true
        System.out.println(main2.equals(main3)); // false
    }
}