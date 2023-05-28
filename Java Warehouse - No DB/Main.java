import java.util.*;

public class Main {
	
	public static final String GREEN = "\u001B[32m";
	public static final String RESET = "\u001B[0m";
	public static final String PURPLE = "\u001B[35m";
	public static final String YELLOW = "\u001B[33m";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop shop = new Shop();
		
		Warehouse w1 = shop.createWarehouse(1,"55th avenue, New York", "Online");
		
		Product p1 = shop.createProduct("Apple Watch SE", 299.99, 4, 1);
		Product p2 = shop.createProduct("Apple iPhone 8", 199.99, 12, 1);
		Product p3 = shop.createProduct("iPhone 14", 899.99, 3, 2);
		
		User u1 = shop.createUser("Francesco", "Tarantino", "Hell, Norway");
		
		Order o1 = shop.createOrder(u1);
		
		o1.addProduct(p1);
		o1.addProduct(p2);
		
		double price1 = 0;
		int quantity;
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		
		while(choice!=3) {
			
			System.out.println("^** This software is created for testing and educational purposes only. **^");
			
			System.out.println("");
			System.out.println("Welcome, "+PURPLE+u1.getName()+RESET);
			System.out.println("");
			
			System.out.println("Products in the Shop:");
			for(Product product : shop.getProducts()) {
				System.out.println(product.getId()+": "+product.getname()+" - "+GREEN+"$"+product.getPrice()+RESET);
				System.out.println("Only "+product.getQuantity()+" left");
			}
			
			System.out.println("");
			System.out.println("** MENU **");
			System.out.println("Select an option (1, 2, 3)");
			System.out.println("1. Process order");
			System.out.println("2. Admin view");
			System.out.println("3. Terminate");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("");
				System.out.println(GREEN+"Thank you for your order! "+RESET);
				System.out.println("");
				System.out.println("");
				System.out.println("\nOrder Details:");
				System.out.println("");
				for(Order order : shop.getOrders()) {
					System.out.println("Order ID: "+order.getId());
					System.out.println("User: "+order.getUser());
					System.out.println("Products: ");
					System.out.println("");
					for(Product product : order.getProducts()) {
						System.out.println("- "+product.getname());
						System.out.println("$"+product.getPrice());
						
						price1 = price1 + product.getPrice();
						
						quantity = product.getQuantity() - 1;
						
						System.out.println("Now only "+quantity+" left");
					}
					
					double total = price1;
					System.out.println("");
					System.out.println("Total:");
					System.out.println(+total+"$");
					System.out.println("");
				}
				
				break;
			case 2:
				System.out.println();
				break;
			
		
			}
			
		}
		
		
		
		
		
			
		}
	}


