
public class Customer {

	static int totalNumberOfCustomers = 0;
	String name;
	int customerNumber;
	Ticket ticket;
	
	public Customer(String name){
		this.name = name;
		totalNumberOfCustomers++;
		customerNumber = 10000 + totalNumberOfCustomers;
	}
	
	public void buyATicket(Ticket ticket){
		this.ticket = ticket;
	}
	
	public int getCustomerNumber(){
		
		return customerNumber;
	}
	
	
}
