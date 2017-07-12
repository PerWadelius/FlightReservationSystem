
public class Ticket {
	
	static int totalNumberOfTickets = 0;
	int ticketNumber = 0;
	Customer customer;
	Flight flight;
	Food food;
	
	public Ticket(Customer customer, Flight flight, Food food){
		
		this.customer = customer;
		this.flight = flight;
		this.food = food;
		totalNumberOfTickets++;
		ticketNumber = 10000 + totalNumberOfTickets;
		
	}
	
	public Ticket(String customerName, Flight flight, Food food){
		
		this.customer = new Customer(customerName);
		this.flight = flight;
		this.food = food;
		totalNumberOfTickets++;
		ticketNumber = 10000 + totalNumberOfTickets;
	}

}
