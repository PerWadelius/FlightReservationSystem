import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FlightReservationSystem {

	List<Customer> allCustomers;
	List<Flight> allFlights;
	List<Food> allFoodReservations;
	List<Airplane> allAirplanes;
	
	
	void addAirplane(Airplane airplane){
		
	}
	
	void addCustomer(String name){
		
		
	}
	
	void createFlight(String source, String destination, LocalDate date, Airplane airplane){
		
		
	}
	
	void buyTicket(Customer customer, Flight flight, Food food){
		
	}
	
	
	void start(){
		
		CLI cli = new CLI();
		
		boolean exitProgram = false;
		
		while(!exitProgram){
			
			cli.printMenu();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			str = br.readLine();
			
			str = str.toLowerCase();
			

			switch (str){
			
				 
				
				case "create flight":
						itemList.addItem(ui.addNewItem());
						
						break;
				case "add aeroplane": 
						itemList.printToDoItemList();
				
						break;
				case "new customer": 
						System.out.println("Which Item do you want to mark as Done? ");
						itemList.markItemDone(ui.readInputFromUser());
				
						break;
				case "buy ticket": 
						System.out.println("Which Item do you want to remove from the list? ");
						itemList.removeItem(ui.readInputFromUser());
						break;
				case "reserve food": 
						itemList.removeAllDoneItems();  
					
						break;
				case "print all customers": 
						System.out.println("Which Item do you search for? ");
						try {
								ui.printToDoItem(itemList.findByName(ui.readInputFromUser()));
						} catch (ToDoItemNotFoundException e) {
								System.out.println("Item not found");
						}
					
						break;
						
				case "print all flights":
						System.out.println("Which ID do you search for? ");
						try {
							sc = new Scanner(System.in);
						    int i = sc.nextInt();
							ui.printToDoItem(itemList.findByID(i));
							
						} 
						catch (ToDoItemNotFoundException e) {
							System.out.println("Item not found");
						}
						catch (NullPointerException e){
							System.out.println("NullpointerException");
						}
				
					break;
					
				case "print all aeroplanes": 
						System.out.println("Which file do you want to save to? ");
						itemList.writeToFile(ui.readInputFromUser());
						break;
				
				case "print statistics":
						itemList.clearList();	
						break;
				case "economy summary":
						System.out.println("Which file do you want to load from? ");
						itemList.clearList();
						itemList = itemList.loadFromFile(ui.readInputFromUser());
						break;
						
				case "delete ticket":
				
						System.out.println("Which Item do you want to edit? ");
						String itemToEdit = ui.readInputFromUser();
						System.out.println("What is the new name of the Item?");
						String newName = ui.readInputFromUser();
						try {
							itemList.editItem(itemList.findByName(itemToEdit), newName);
						} catch (ToDoItemNotFoundException e) {
							System.out.println("Item not found in the To Do list");
						}
						break;
						
				case "delete customer": 
						System.out.println("Which Item do you want to mark as not Done? ");
						itemList.markItemNotDone(ui.readInputFromUser());
					
						break;
				case "exit": 
						exitProgram = true;
						//itemList.writeToFile("ToDoItemList.xml");
						System.out.println("Program will exit ...");
						break;
						
			
				default: 
					
						break;
						
				
			}	
		}
		
		
	}
	
	
	
	
}
