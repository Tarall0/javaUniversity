package eTivityWarehouses;


public class Order{
	
	private int id_order;
	private User user;
	private Product product;
	
	public Order(int id_order, User user, Product product) {
		
		this.user = user;
		this.product = product;
		this.id_order = id_order;
		
	}
	
	public double getOrderPrice() {
		double price = product.getPrice();
		
		return price;
	}
	
	public String getUserName() {
		String username = user.getUsername();
		return username;
	}
	
	public String getUserLastName() {
		String lastname = user.getLastname();
		return lastname;
	}
	
	public String getAddressShip() {
		String shipto = user.getAddress();
		return shipto;
	}
	
	public int getIdOrder() {
		return id_order;
	}
	
	public int getIdProduct() {
		int idprod = product.getID();
		
		return idprod;
	}
	
	public int processOrder() {
		int prodTotal = product.getQuantity();
		
		if(prodTotal <= 0) {
			System.out.println("");
			System.out.println("We are out of stock!");
			System.out.println("Product not available at the moment");
		}
		
		else {
			System.out.println("");
			System.out.println("Thank you for your order");
			product.setOrder();
			
			System.out.println("");
			System.out.println("Order ID:"+id_order+" Product ID:"+product.getID()+"| Ship To:"+user.getAddress());
			System.out.println("First Name: "+user.getUsername());
			System.out.println("Family Name: "+user.getLastname());
		}
		
		
		
		
		return prodTotal;
		
		
		
	}

}
