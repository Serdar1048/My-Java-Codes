
public class Movie {
	private String movieName, mpaaRating;
	private int terrible = 0, bad = 0, ok = 0, good = 0, great = 0;

	public Movie(String movieName, String mpaaRating) {
		this.movieName = movieName;
		this.mpaaRating = mpaaRating;

	}

	public void addRatting(int rate) {
		if (rate <= 5 && rate > 0) {
			switch (rate) {
			case 1:
				terrible++;
				break;
			case 2:
				bad++;
				break;
			case 3:
				ok++;
				break;
			case 4:
				good++;
				break;
			case 5:
				great++;
				break;
			}
		} else {
			System.out.println("Please Enter Valid number(1-5)");
		}

	}

	public double getAverage() {
		return (terrible + bad * 2 + ok * 3 + good * 4 + great * 5) / 5.0;

	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
	}

	public int getTerrible() {
		return terrible;
	}

	public void setTerrible(int terrible) {
		this.terrible = terrible;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	public int getOk() {
		return ok;
	}

	public void setOk(int ok) {
		this.ok = ok;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getGreat() {
		return great;
	}

	public void setGreat(int great) {
		this.great = great;
	}
}
