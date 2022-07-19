package etc;

public class Lv1_3 {
    public static void main(String[] args) {
        int money = 10000000;
        int year = 0;
        int interest = 0;
        while (money < 20000000) {
            interest = (int) (money * 0.07);
            money += interest;
            year++;
            System.out.println("money = " + money);
        }
        System.out.println("year = " + year);
    }
}
