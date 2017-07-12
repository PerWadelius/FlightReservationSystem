import java.time.LocalDate;
import java.util.List;

public class Flight {
	
	String flightID;
	Airplane airPlane;
	String source;
	String destination;
	LocalDate date;
	
	int numberOfBusinessClassSeats;
	int numberOfEconomyClassSeats;
	
	List<Seat> seats; //Should this be fixed for each airplane type? 
	List<Customer> customers; // or tickets?
	List<Ticket> tickets;
	
	public Flight(Airplane airPlane, String source, String destination, LocalDate date){
		
		
		
	}
	
	public void setNumberOfBusinessClassSeats(int number){  //Maybe need to be part of the constructor?
		this.numberOfBusinessClassSeats = number;
	}

	public void setNumberOfEconomyClassSeats(int number){ //Maybe need to be part of the constructor?
		this.numberOfEconomyClassSeats = number;
	}
	
	
	public void makeReservation(){  //Parameter: Business or Economy class, throws exception if not available
		
		
	}

}
