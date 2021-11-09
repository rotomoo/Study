package obejectOriented;

public class Rental {
    private Movie moive;
    private int daysRented;

    public int getFrequentRenterPoints() {
        return moive.getFrequentRenterPoints(daysRented);
    }
}
