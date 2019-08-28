import org.scalatest.FunSuite

class CustomerTest extends FunSuite {


  test("getName should return customer name") {
    val customer = new Customer("Sandy")

    assert(customer.getName == "Sandy")
  }

  test("ToRentRegularMovieForOneDayShouldChargeTwoRupeesAndProvideOneFrequentRenterPoint") {
    val customer = new Customer("Sandy")
    val name = customer.getName
    val movieTitle = "Rush"
    var result = "Rental Record for " + name + "\n"
    val thisAmount = 2.0
    val totalAmount = 2.0
    val frequentRenterPoints = 1
    result += "\t" + movieTitle + "\t" + String.valueOf(thisAmount) + "\n"
    result += "Ammount owed is " + String.valueOf(totalAmount) + "\n"
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points"

    customer.addRental(new Rental(new Movie("Rush", new RegularPrice), 1))
    assert(customer.statement() == result)
  }

  test("ToRentNewReleaseMovieForthreeDaysShouldCharge10.5UnitsAndProvideTwoFrequentRenterPoint") {
    val customer = new Customer("Sandy")

    val name = customer.getName
    val movieTitle = "Crash"
    var result = "Rental Record for " + name + "\n"
    val thisAmount = 10.5
    val totalAmount = 10.5
    val frequentRenterPoints = 2
    result += "\t" + movieTitle + "\t" + String.valueOf(thisAmount) + "\n"
    result += "Ammount owed is " + String.valueOf(totalAmount) + "\n"
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points"

    customer.addRental(new Rental(new Movie(movieTitle, new NewReleasePrice), 3))
    assert(customer.statement() == result)
  }
}
