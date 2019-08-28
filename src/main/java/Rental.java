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
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;

            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;

            case Movie.NEW_RELEASE:
                result += 1.5;
                System.out.println("This Ammount add 1.5: "+result);
                result += getDaysRented() * 3;
                System.out.println("This Ammount 3*3 = 9 + 1.5: "+result);
                break;
        }
        System.out.println("This Ammount: "+result);
        return result;
    }
}