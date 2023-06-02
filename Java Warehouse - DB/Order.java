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
	
	public void save(Connection connection) throws SQLException {
		String query = "INSERT INTO order (id, user, products) VALUES (?, ?, ?);
		try (PreparedStatement statement = connection.prepareStatement(query)) {
            		statement.setInt(1, id);
            		statement.setString(2, user);
            		statement.setArrayList(3, products);
            		statement.executeUpdate();
        	}
        // should implement insert/update/delete/retrieval operations
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
