
public class Book {
	public String name, author, publisher;
	private int numberOfPage;

	public Book(String name, int numberOfPage, String author, String publisher) {
		this.name = name;
		this.numberOfPage = numberOfPage;
		this.author = author;
		this.publisher = publisher;
		
	}
	public int getNumberOfPage() {
		return numberOfPage;
	}
	public void setNumberOfPage(int numberOfPage) {
		if(numberOfPage<1) {
			this.numberOfPage=0;
		}else {
			this.numberOfPage=numberOfPage;
		}
	}
}
