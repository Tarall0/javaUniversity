package eTivityWarehouses;
import java.util.Scanner;

public class Main {
	
	public static final String GREEN = "\u001B[32m";
	public static final String RESET = "\u001B[0m";
	public static final String PURPLE = "\u001B[35m";
	public static final String YELLOW = "\u001B[33m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st Version with no DataBase involved for the example
					
		Product p1 = new Product(1,20.4,"Headphones",200,1);
		Product p2 = new Product(2, 289.5, "Apple Watch",4,1);
		
		Warehouse w1 = new Warehouse(1,"55th avenue, New York");
		
		User u1 = new User(420, "Francesco", "Tarantino", "Hell, Norway","User");
		
		Order o1 = new Order(1, u1, p1);
		
		Order o2 = new Order(2, u1, p2);
		
		
		
		
		int total1 = p1.getQuantity();
		int total2 = p2.getQuantity();
		System.out.println("^** This software is created for testing and educational purposes only. **^");

		
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		
		while(choice!=3) {
			System.out.println("");
			System.out.println("Welcome, "+PURPLE+u1.getUsername()+RESET+" - "+u1.role());
			System.out.println("");
			System.out.println("---------------");
			System.out.println(YELLOW+"-- Products  "+RESET);
			System.out.println("---------------");
			System.out.println(" ## "+p1.getDesc()+" ## ");
			System.out.println("Price: "+p1.getPrice());
			System.out.println("Quantity: "+p1.getQuantity());
			System.out.println("Wharehous ID: "+p1.getIdWarehouse());
			System.out.println("");
			System.out.println(" ## "+p2.getDesc()+" ## ");
			System.out.println("Price: "+p2.getPrice());
			System.out.println("Quantity: "+p2.getQuantity());
			System.out.println("Wharehouse ID: "+p2.getIdWarehouse());
			System.out.println("");
			System.out.println("");
			System.out.println("Select one option available");
			System.out.println("1. "+p1.getDesc());
			System.out.println("2. "+p2.getDesc());
			System.out.println("3. Exit ");
			
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				o1.processOrder();
				break;
			case 2:
				o2.processOrder();
				break;
			
		
			}
		}


	}
	
	public static int totalProduct(int quantity1, int quantity2) {
		return quantity1 + quantity2;
	}
	

}
