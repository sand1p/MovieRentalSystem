class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        result += daysRented * 3;
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        //add Bonus for a two day new release rental
        if(daysRented > 2) return 2;
        else return 1;
    }
}
