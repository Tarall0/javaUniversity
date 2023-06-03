import java.util.*;
import java.sql.*;

/**
 * 
 * @author Francesco Tarantino aka Tarallo
 * 
 * This software was created for the sole purpose of education, being part of a university exam that the author is preparing for
 *
 */

public class Main {
	
	
	
	// Just for some very basic style
	
	public static final String GREEN = "\u001B[32m";
	public static final String RESET = "\u001B[0m";
	public static final String PURPLE = "\u001B[35m";
	public static final String YELLOW = "\u001B[33m";
	public static final String RED = "\u001B[31m";
	public static final String CYAN = "\u001B[36m";
	
	
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
            
            Admin a1 = new Admin(1, "Francesco", "Tarantino", "Test Street", "Administrator", "CEO and Dev");
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
                System.out.println("-------");
                
               
            }
            
            List<User> users = shop.getAllUsers(connection);
            System.out.println("");
            System.out.println("Users available:");
            System.out.println("");
            for (User user : users) {
           
                System.out.println("ID: "+user.getUserId()+" ~ " + user.getName()+ " - " + user.getRole());
                System.out.println("----");
               
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
    			System.out.println("");
    			System.out.println("Welcome "+a1.getName()+" - "+a1.getRole()+" ~ "+ a1.getRank()+" )");
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
    				System.out.print("Product ID:"+YELLOW);
    				int new_id = in.nextInt();
    				System.out.print(RESET+"Product Name: "+YELLOW);
    				String new_name = in.next();
    				System.out.print(RESET+"Product Price: "+YELLOW);
    				double new_price = in.nextDouble();
    				System.out.print(RESET+"Product Quantity: "+YELLOW);
    				int new_quant = in.nextInt();
    			
    				
    				
    				Product pAdd = new Product(new_id, new_name, new_price, new_quant);
    				
    				pAdd.save(connection);
    				
    				System.out.println(GREEN+"Product has been added!");
    				
    				break;
    			case 2:
    				System.out.println(PURPLE+"| 2. Delete Product"+RESET);
    				System.out.println("");
    				System.out.print("Product ID: "+YELLOW);
    				int del_id = in.nextInt();
    				Product pDel = new Product(del_id);
    				pDel.del(connection);
    				System.out.println(RED+"Product has been removed!"+RESET);
    				break;
    				
    			case 3:
    				System.out.println(PURPLE+"| 3. Edit Product"+RESET);
    				System.out.println("");
    				System.out.print("Product ID: "+YELLOW);
    				int edit_id = in.nextInt();
    				Product pEdit = new Product(edit_id);
    				
    				
    				System.out.print(RESET+"Product Name:"+YELLOW);
    				String edit_name = in.next();
    				pEdit.setName(edit_name);
    				System.out.print(RESET+"Product Price:"+YELLOW);
    				double edit_price = in.nextDouble();
    				pEdit.setPrice(edit_price);
    				System.out.print(RESET+"Product Quantity:"+YELLOW);
    				int edit_quant = in.nextInt();
    				pEdit.setQuantity(edit_quant);    				
    				System.out.println(CYAN+"Product has been modified!"+RESET);
    				pEdit.upd(connection, edit_id, edit_name, edit_price, edit_quant);
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
