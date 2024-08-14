
/**
 * Consider a class Movie that contains information about a movie. The class has
 * the following attributes: • The movie name • The MPAA rating (e.g., G, PG,
 * PG-13, R) • The number of people who have rated this movie as a 1 (Terrible)
 * • The number of people who have rated this movie as a 2 (Bad) • The number of
 * people who have rated this movie as a 3 (OK) • The number of people who have
 * rated this movie as a 4 (Good) • The number of people who have rated this
 * movie as a 5 (Great) Implement the class with accessors and mutators for the
 * movie name and MPAA rating. Write a method addRating that takes an integer as
 * an input parameter. The method should verify that the parameter is a number
 * between 1 and 5, and if so, increment by one the number of people rating the
 * movie that matches the input parameter. For example, if 3 is the input
 * parameter, then the number of people who rated the movie as a 3 should be
 * incremented by one. Write another method, getAverage, that returns the
 * average value for all of the movie ratings. Test the Movie class by creating
 * a Movie object and adding several ratings to the movie. Print the average
 * rating for the movie.
 */
public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie("Avangers", "G");
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter your rate for " + m1.getMovieName() + " :");
//		int rate = scan.nextInt();
		m1.addRatting(3);
		m1.addRatting(4);
		m1.addRatting(2);
		m1.addRatting(5);
		m1.addRatting(4);
		m1.addRatting(4);

		System.out.println(m1.getAverage());

	}
}
