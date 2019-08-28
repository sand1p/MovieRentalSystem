abstract class Price {
    abstract int getPriceCode();

    abstract public double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        //add Bonus for a two day new release rental
        return daysRented > 1 ? 2:1 ;
    }
}

