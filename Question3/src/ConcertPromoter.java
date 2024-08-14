
public class ConcertPromoter {

	private String bandName;
	private int venueCapacity, ticketsSold;
	private double phoneTPrice, venueTPrice, totalSalesAmount;

	ConcertPromoter(String bandName, int venueCapacity, double phoneTPrice, double venueTPrice) {
		this.bandName = bandName;
		this.venueCapacity = venueCapacity;
		this.phoneTPrice = phoneTPrice;
		this.venueTPrice = venueTPrice;
		this.ticketsSold = 0;
		this.totalSalesAmount = 0;
	}

	public void recordTicketSale(int tickets) { // Record the sale of one or more tickets

		if (this.venueCapacity >= ticketsSold + tickets) {
			ticketsSold += tickets;
	        totalSalesAmount += tickets * (ticketsSold <= venueCapacity ? phoneTPrice : venueTPrice);
		} else {
			System.out.println("capacity exceeded!!");
		}
	}

	public void changeSalesLocation() {

		System.out.println("**concert day**");
		phoneTPrice = 0;
		venueTPrice = 50.0;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public int getTicketsRemaining() {
		return venueCapacity - ticketsSold;
	}

	public double getTotalSales() {
		return totalSalesAmount;
	}
}
//public class ConcertPromoter {
//    private String bandName;
//    private int venueCapacity;
//    private int ticketsSold;
//    private double phoneTicketPrice;
//    private double venueTicketPrice;
//    private double totalSalesAmount;
//
//    // Constructor
//    public ConcertPromoter(String bandName, int venueCapacity, double phoneTicketPrice, double venueTicketPrice) {
//        this.bandName = bandName;
//        this.venueCapacity = venueCapacity;
//        this.phoneTicketPrice = phoneTicketPrice;
//        this.venueTicketPrice = venueTicketPrice;
//    }
//
//    // Record the sale of one or more tickets
//    public void recordTicketSale(int tickets) {
//        // Preconditions
//        if (tickets < 0 || ticketsSold + tickets > venueCapacity) {
//            throw new IllegalArgumentException("Invalid ticket sale.");
//        }
//
//        // Postconditions
//        ticketsSold += tickets;
//        totalSalesAmount += tickets * (ticketsSold <= venueCapacity ? phoneTicketPrice : venueTicketPrice);
//    }
//
//    // Change from phone sales to sales at the concert venue
//    public void changeSalesLocation() {
//        // Preconditions: None
//        
//        // Postconditions
//        phoneTicketPrice = 0; // Free tickets for in-person sales
//        venueTicketPrice = 50.0; // Example price
//    }
//
//    // Return the number of tickets sold
//    public int getTicketsSold() {
//        // Preconditions: None
//        
//        // Postconditions
//        return ticketsSold;
//    }
//
//    // Return the number of tickets remaining
//    public int getTicketsRemaining() {
//        // Preconditions: None
//        
//        // Postconditions
//        return venueCapacity - ticketsSold;
//    }
//
//    // Return the total sales for the concert
//    public double getTotalSales() {
//        // Preconditions: None
//        
//        // Postconditions
//        return totalSalesAmount;
//    }
//
//    // Main method to test the class
//    public static void main(String[] args) {
//        ConcertPromoter promoter = new ConcertPromoter("Example Band", 1000, 30.0, 0.0);
//
//        promoter.recordTicketSale(500); // Phone sales
//        System.out.println("Kalan bilet sayısı: " + promoter.getTicketsRemaining());
//
//        promoter.changeSalesLocation(); // Change to venue sales
//        promoter.recordTicketSale(300); // Venue sales
//        System.out.println("Kalan bilet sayısı: " + promoter.getTicketsRemaining());
//
//        System.out.println("Toplam satış tutarı: $" + promoter.getTotalSales());
//        System.out.println("Satılan bilet sayısı: " + promoter.getTicketsSold());
//    }
//}
