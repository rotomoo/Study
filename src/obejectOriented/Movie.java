package obejectOriented;


public class Movie {
    public static int regular=0;
    public static int new_Release=1;
    private int priceCode;

    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode==new_Release && daysRented>1) {
            return 2;
        }
        else return 1;
    }
}