public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode()  {
        return  _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle () {
        return _title;
    }

    public double getCharge(int daysRented) {
        //determine amounts for each line
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;

            case CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;

            case NEW_RELEASE:
                result += 1.5;
                System.out.println("This Ammount add 1.5: " + result);
                result += daysRented * 3;
                System.out.println("This Ammount 3*3 = 9 + 1.5: " + result);
                break;
        }
        System.out.println("This Ammount: " + result);
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        //add Bonus for a two day new release rental
        if ((_priceCode == Movie.NEW_RELEASE)
                && daysRented > 2) return 2;
        else return 1;
    }


}
