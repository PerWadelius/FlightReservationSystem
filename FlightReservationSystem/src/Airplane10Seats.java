import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Airplane10Seats extends Airplane {
	
	final int totalNumberOfSeats = 10;
	
	// Should the Airplane object have control of available/free seats or just the maximum number of seats?
	boolean[] businessClassSeats = new boolean[10];  // false means not booked seat, true means the seat is booked. 
	boolean[] economyClassSeats = new boolean[10];
	
	HashMap<LocalDate, Flight> bookedDates = new HashMap<>();
	
	public Airplane10Seats(){
	
		
	}
	
	public void bookDate(LocalDate date, Flight flight){
		
		
	}
	
	
	
	
}
