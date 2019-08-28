public class Rental {

    Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public int getFrequentRenterPoints() {
        //add Bonus for a two day new release rental
        return _movie.getFrequentRenterPoints(_daysRented);
    }

    public double getCharge() {
        //determine amounts for each line
        return _movie.getCharge(_daysRented);
    }

}