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
        
            Product p1 = new Product(1, "Product 1", 10.99, 255);
 
            Admin a1 = new Admin(1, "Francesco", "Tarantino", "Test Street", "Administrator", "CEO and Dev");
          
            
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
    			System.out.println("Welcome "+a1.getName()+" - "+RED+a1.getRole()+RESET+" ~ "+ a1.getRank()+" )");
    			System.out.println("\033[3mAs an Administrator, you can "
    					+ "add, update or delete products. As Administrato, you will also be able to manage users\033[0m");
    			System.out.println("");
    			System.out.println("Select an option (1, 2, 3) >");
    			System.out.println("1. Add Product");
				System.out.println("2. Delete Product");
				System.out.println("3. Edit product");
				System.out.println("4. Add user");
				System.out.println("5. Delete user");
				System.out.println("6. Edit user");
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
    				System.out.print(RESET+"Product Price: "+YELLOW);
    				double new_price = in.nextDouble();
    				System.out.print(RESET+"Product Quantity: "+YELLOW);
    				int new_quant = in.nextInt();
    				System.out.print(RESET+"Product Name: "+YELLOW);
    				String new_name = in.next();
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
    				String edit_name = in.nextLine();
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
    			
    			case 4:
    				System.out.println(PURPLE+"| 4. Add user"+RESET);
    				System.out.println("");
    				System.out.print("First Name: "+YELLOW);
    				String firstname = in.next();
    				System.out.print(RESET+"Last Name: "+YELLOW);
    				String lastname = in.next();
    				System.out.print(RESET+"Role: "+YELLOW);
    				String roleuser = in.next();
    				System.out.print(RESET+"Address: "+YELLOW);
    				String addressuser = in.next();
    				User addUser = new User(firstname, lastname, addressuser, roleuser);
    				addUser.save(connection);
    				System.out.println(GREEN+"User has been added successfully!");
    				break;
    				
    			case 5:
    				System.out.println(PURPLE+"| 5. Delete user"+RESET);
    				System.out.println("");
    				System.out.print("Insert User ID: "+YELLOW);
    				int userID = in.nextInt();
    				User uDel = new User(userID);
    				uDel.delete(connection);
    				System.out.println(RED+"The User (ID: "+uDel.getUserId()+") has been removed!"+RESET);
    				break;
    			case 6:
    				System.out.println(PURPLE+"| 5. Edit user"+RESET);
    				System.out.println("");
    				System.out.print("Insert User ID: "+YELLOW);
    				int edituserID = in.nextInt();
    				User userEdit = new User(edituserID);
    				System.out.println(RESET+"New name: "+YELLOW);
    				String newUsername = in.next();
    				System.out.println(RESET+"New lastname: "+YELLOW);
    				String newLastname = in.next();
    				System.out.println(RESET+"New address: "+YELLOW);
    				String newAddress = in.next();
    				System.out.println(RESET+"New role: "+YELLOW);
    				String newRole = in.next();
    				userEdit.update(connection, edituserID, newUsername, newLastname, newAddress, newRole);
    				System.out.println(CYAN+"The user (ID: "+userEdit.getUserId()+") has been modified!"+RESET);
    				break;
    				
    				
    				
    				
    			}
    				
    			break;
    
    			
    		case 2:
    			System.out.println("You are logged in as a User");
    			System.out.println("");
    			System.out.println("Do you want to place an order?");
    			System.out.println("(y/n)");
    			
    			
    		
    			String userChoose = "";
    			
    			Scanner uin = new Scanner(System.in);
    			
    			userChoose = uin.next();
    			
    			switch(userChoose) {
    			case "y":
    				
    				int min = 100; // Minimum value of range
    			    int max = 998; // Maximum value of range
    			    
    				int orderid = (int)Math.floor(Math.random() * (max - min + 1) + min + 1);
    				
    				Order order = new Order(orderid, new User("John", "Snow", "Winterfell", "User"), Arrays.asList(p1));
    			
    		        int productChoice = 1;
    		        while (productChoice != 0) {
    		            System.out.print("Enter a product ID to add (or '0' to finish): ");
    		            productChoice = in.nextInt();
    		            if (productChoice != 0) {
    		                int productId = productChoice;
    		                Product product =  shop.getProductById(connection, productId);
    		                if (product != null) {
    		                	
    		                	
    		                    order.addProduct(product);
    		             
    		                    System.out.println("Product added to the order.");
    		                    product.takeOne();
    		                    int pleft = product.getQuantity();
    		                    product.updateleft(connection, productId, pleft);
    		                    order.update(connection);
    		                    
    		                } else {
    		                    System.out.println("Product not found.");
    		                }
    		                
    		            }
    		        }
    		     
    		        order.save(connection);
    		       
    		        
    		        System.out.println("Order ID: " + order.getId());
    		        System.out.println("User: " + order.getUser().getName());
    		        System.out.println("Shipment details: "+order.getUser().getAddress());
    		        System.out.println("Products:");
    		        double total_price = 0;
    		        order.setProducts(products);
    		        for (Product product : order.getProducts()) {
    		            System.out.println("Product ID: " + product.getId());
    		            System.out.println("Name: " + product.getname());
    		            System.out.println("Price: " + product.getPrice()+"$");
    		         
    		            total_price = total_price + product.getPrice();
    		            System.out.println("----------------------");
    		        }
    		        
    		        System.out.println("Total: "+total_price+"$");
    		        break;

    			case "n":
    				System.out.println("Thank you for visiting our shop!");
    				break;
    				
    			}
    			
    			break;
    			}
            

          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
