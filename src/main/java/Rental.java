public class Rental {

    private Movie _movie;
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

    public double getCharge() {
        //determine amounts for each line
        double thisAmount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (getDaysRented() > 2)
                    thisAmount += (getDaysRented() - 2) * 1.5;
                break;

            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (getDaysRented() > 3)
                    thisAmount += (getDaysRented() - 3) * 1.5;
                break;

            case Movie.NEW_RELEASE:
                thisAmount += 1.5;
                System.out.println("This Ammount add 1.5: "+thisAmount);
                thisAmount += getDaysRented() * 3;
                System.out.println("This Ammount 3*3 = 9 + 1.5: "+thisAmount);
                break;
        }
        System.out.println("This Ammount: "+thisAmount);
        return thisAmount;
    }
}