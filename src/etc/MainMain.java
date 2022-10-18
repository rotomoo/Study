package etc;

public class MainMain {

    public static void main(String[] args) {
        try {
            System.out.println("1 = " + 1);
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("1 = " + 2);
            throw new RuntimeException();
        } finally {
            System.out.println("wow!!!!!!!!!");
        }
    }

}

