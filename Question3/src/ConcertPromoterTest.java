
/**
 * Consider a class ConcertPromoter that records the tickets sold for a
 * performance. Before the day of the concert, tickets are sold only over the
 * phone. Sales on the day of the performance are made only in person at the
 * concert venue. The class has the following attributes: • The name of the band
 * • The capacity of the venue • The number of tickets sold • The price of a
 * ticket sold by phone • The price of a ticket sold at the concert venue • The
 * total sales amount It has methods to • Record the sale of one or more tickets
 * • Change from phone sales to sales at the concert venue • Return the number
 * of tickets sold • Return the number of tickets remaining • Return the total
 * sales for the concert a. Write a method heading for each method. b. Write
 * preconditions and postconditions for each method. c. Write some Java
 * statements that test the class. d. Implement the class. e. List any
 * additional methods and attributes needed in the implementation that were not
 * listed in the original design. List any other changes made to the original
 * design. f. Write a program using the class you wrote for Part d that will be
 * used to record sales for a concert. Your program should record phone sales,
 * then sales at the venue. As tickets are sold, the number of seats remaining
 * should be displayed. At the end of the program, display the number of tickets
 * sold and the total sales amount for the concert.
 */
public class ConcertPromoterTest {
	public static void main(String[] args)
    {
    	ConcertPromoter c1 = new ConcertPromoter("zy", 1000, 30.0,50.0);
    	c1.recordTicketSale(500);
    	System.out.println("remaining ticket: " + c1.getTicketsRemaining());
    	
    	c1.changeSalesLocation();
    	c1.recordTicketSale(300);
    	System.out.println("remaining ticket: " +c1.getTicketsRemaining());
    	
    	System.out.println("Total sale Amount: $" + c1.getTotalSales());
    	System.out.println("Total Sale ticket: " + c1.getTicketsSold());
    	
    }
}
