import java.util.*;

public class Order{
	
	private int id;
	private User user;
	private List<Product> products;
	
	public Order(int id, User user) {
		this.id = id;
		this.user = user;
		this.products = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getUser() {
		return user.getName();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public List<Product> getProducts(){
		return products;
	}
	

}

