package data;

import java.util.ArrayList;

public class ListBoxingTest {

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        long s = 1;
        for(int i=0; i< 30000000; i++) {
            s = s;
        }
        System.out.println("runtime = " + (System.currentTimeMillis() - t) + " ms"); // runtime = 5 ms
    }

//    public static void main(String[] args) {
//        long t = System.currentTimeMillis();
//        Long s = 1L;
//        for(int i=0; i< 30000000; i++) {
//            s = s;
//        }
//        System.out.println("runtime = " + (System.currentTimeMillis() - t) + " ms"); // runtime = 254 ms
//    }

//    public static void main(String[] args) {
//        long t = System.currentTimeMillis();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i< 30000000; i++) {
//            list.add(5);
//        }
//        System.out.println("runtime = " + (System.currentTimeMillis() - t) + " ms"); // runtime = 1690 ms
//    }

//    public static void main(String[] args) {
//        long t = System.currentTimeMillis();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i< 30000000; i++) {
//            list.add(Integer.valueOf(5));
//        }
//        System.out.println("runtime = " + (System.currentTimeMillis() - t) + " ms"); // runtime = 1743 ms
//    }
}
