abstract class Price {
    abstract int getPriceCode();

    abstract public double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        //add Bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE)
                && daysRented > 2) return 2;
        else return 1;
    }
}

class ChildrensPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}

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
}

class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}

