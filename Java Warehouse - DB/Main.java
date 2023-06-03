import java.util.*;
import java.sql.*;

public class Main {
	
	
	public static final String GREEN = "\u001B[32m";
	public static final String RESET = "\u001B[0m";
	public static final String PURPLE = "\u001B[35m";
	public static final String YELLOW = "\u001B[33m";
	private static String totalProduct;
	
	
    public static void main(String[] args) {
    	
    	
        Shop shop = new Shop();
        try (Connection connection = shop.getConnection()) {
            // Create products
            Product p1 = new Product(1, "Product 1", 10.99, 255);
            Product p2 = new Product(2, "Product 2", 19.99, 22);
            Product p3 = new Product(3, "Product 3", 7.99, 33);
           // p1.save(connection);
          //  p2.save(connection);
          //  p3.save(connection);

            // Create users
            User u1 = new User(1, "Francesco", "Tarantino", "Test Street", "Administrator");
            User u2 = new User(2, "User 2",  "Test", "Test Street", "User");
           // u1.save(connection);
           // u2.save(connection);

            // Create orders
            Order o1 = new Order(1, u1);
            Order o2 = new Order(2, u2);
           // o1.addProduct(p1);
           // o1.addProduct(p2);
           // o2.addProduct(p2);
           // o2.addProduct(p3);
           // o1.save(connection);
           // o2.save(connection);
            
            // Products Current List
            
            int totalProducts = 0;
            
            List<Product> products = shop.getAllProducts(connection);
            System.out.println("*************************");
            System.out.println("***     Products      ***");
            System.out.println("*************************");
            System.out.println("");
            for (Product product : products) {
                System.out.println("Product ID: " + product.getId());
                System.out.println("Name: " + product.getname());
                System.out.println("Price: " +GREEN+ product.getPrice()+"$"+RESET);
                System.out.println("Quantiy: " + product.getQuantity());
                System.out.println("----------------------");
                
               
            }
            
            List<User> users = shop.getAllUsers(connection);
            System.out.println("");
            System.out.println("Users available:");
            System.out.println("");
            for (User user : users) {
           
                System.out.println("ID: "+user.getUserId()+" ~ " + user.getName()+ " - " + user.getRole());
                System.out.println("----------------------");
               
            }
            
            int choice = 0;
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("");
            System.out.println("");
    		
            System.out.println("Select an option (1, 2) >");
			System.out.println("1. Administrator");
			System.out.println("2. User");
    		
    		choice = in.nextInt();
    			
    		switch(choice){
    		case 1: 
    			int id = 1;
    			System.out.println("");
    			System.out.println("Welcome "+shop.getUserAdmin(connection, id));
    			System.out.println("As an Administrator, you can "
    					+ "add, update or delete products. As Administrato, you will also be able to manage users ");
    			System.out.println("");
    			System.out.println("Select an option (1, 2, 3) >");
    			System.out.println("1. Add Product");
				System.out.println("2. Delete Product");
				System.out.println("3. Edit product");
				System.out.println("");
    			
    				
    			int choiceAdmin = 0;
    	            
    	        Scanner inAdmin = new Scanner(System.in);
    	        choiceAdmin = inAdmin.nextInt();
    	        switch(choiceAdmin){
    			case 1: 
  
    				System.out.println(PURPLE+"| 1. Add Product"+RESET);
    				System.out.println("");
    				
    				
    				break;
    			case 2:
    				System.out.println(PURPLE+"| 2. Delete Product"+RESET);
    				System.out.println("");
    				break;
    				
    			case 3:
    				System.out.println(PURPLE+"| 3. Edit Product"+RESET);
    				System.out.println("");
    				break;
    			
    			}
    				
    			break;
    		case 2:
    			System.out.println("You are logged in as a user");
    			break;
    			
    			}
            

          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
