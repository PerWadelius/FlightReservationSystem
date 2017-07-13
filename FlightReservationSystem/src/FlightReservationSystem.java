import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.reservations.Airplane;

public class FlightReservationSystem {

	List<Customer> allCustomers = new ArrayList<>();
	List<Flight> allFlights = new ArrayList<>();
	List<Food> allFoodReservations = new ArrayList<>();
	List<Airplane> allAirplanes = new ArrayList<>();
	List<Ticket> allTickets = new ArrayList<>();
	
	void removeCustomer(String name){
		allCustomers.removeIf(s-> s.name.equals(name));
	}
	
	void addAirplane(Airplane airplane){
		allAirplanes.add(airplane);
	}
	
	Customer addCustomer(String name){
		
		Customer c = new Customer(name); // Add contructor with only name as a parameter.
		allCustomers.add(c);
		return c;
		
	}
	
	void createFlight(String source, String destination, LocalDate date, int airplaneID){
		
		allFlights.add(new Flight(allAirplanes.get(airplaneID), source, destination, date));
		
	}
	
	void buyTicket(Customer customer, Flight flight, Food food){
		
	}
	
	
	void start(){
		
		CLI cli = new CLI();
		
		Customer currentCustomer; 
		
		boolean exitProgram = false;
		
		while(!exitProgram){
			
			cli.printMenu();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = br.readLine();
			
			str = str.toLowerCase();
			

			switch (str){
			
				 
				
				case "create flight":
						
						
					//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String source, destination, date;
						String airplaneID;
						
						System.out.println("Type in the source of the flight: ");
						source = br.readLine();
						
						System.out.println("Type in the destination of the flight: ");
						destination = br.readLine();
						
						System.out.println("Type in the date of the flight, format yy-mm-dd: ");
						date = br.readLine();
						
						System.out.println("Type in the ID of the airplane: ");
						airplaneID = br.readLine();
					
						createFlight(source, destination, date, airplaneID);
						
						break;
						
				case "add aeroplane": 
						//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String airPlaneName;
						System.out.println("Type in a name of the airplan: ");
						airPlaneName = br.readLine();
						allAirplanes.add(new Airplane(airPlaneName));
						break;
						
				case "new customer": 
						
						//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String customerName;
						System.out.println("Type in the name of the customer: ");
						customerName = br.readLine();
						currentCustomer = addCustomer(customerName);
						
						break;
				case "buy ticket": 
						//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						//String source, destination, date;
						String flightNumber;  //, customerName;
					
						System.out.println("Type in the flight number: ");
						flightNumber = br.readLine();
						System.out.println("Type in the customer name: ");
						customerName = br.readLine();
							
						buyTicket(currentCustomer, allFlights.get(Integer.parseInt(flightNumber)), null);
						
						
						break;
				case "reserve food": 
						  
					
						break;
				case "print all customers": 
						allCustomers.forEach(s-> System.out.println(s));
					
						break;
						
				case "print all flights":
						allFlights.forEach(s-> System.out.println(s));
						break;
					
				case "print all aeroplanes": 
						allAirplanes.forEach(s-> System.out.println(s));
						break;
				
				case "print statistics":
						
						break;
						
				case "economy summary":
						
						break;
						
				case "delete ticket":
				
					
						break;
						
				case "Remove customer": 
						System.out.println("Which customer do you want to remove? ");
						customerName = br.readLine();
						removeCustomer(customerName);
						break;
						
				case "exit": 
						exitProgram = true;
						System.out.println("Program will exit ...");
						break;
						
			
				default: 
					
						break;
						
				
			}	
		}
		
		
	}
	
	
	
	
}
