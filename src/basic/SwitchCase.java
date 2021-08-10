package basic;

public class SwitchCase {
    public static void main(String[] args) {
        int month = 3 ;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Fabruary");
                break;
            case 5:
                System.out.println("may");
                break;
            default:
                System.out.println("일치하는 값 없음.");
        }
    }
}