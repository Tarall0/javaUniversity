import java.util.*;
import java.sql.*;



public class Shop {
	
	private List<Product> products;
	private List<User> users;
	private List<Order> orders;
	private int nextProductId;
	private int nextUserId;
	private int nextOrderId;

	// Database connection properties
    private static final String DB_URL = "jdbc:mysql://localhost:3306/shop";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    // Database table names
    private static final String TABLE_PRODUCTS = "products";
    private static final String TABLE_USERS = "user";
    private static final String TABLE_ORDERS = "orders";

    
    public Shop() {
        // Initialize database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
    
    public List<Product> getAllProducts(Connection connection) throws SQLException {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE_PRODUCTS;
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                Product product = new Product(id, name, price, quantity);
                products.add(product);
            }
        }
        return products;
    }

    public List<User> getAllUsers(Connection connection) throws SQLException {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE_USERS;
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastname = resultSet.getString("lastname");
                String address = resultSet.getString("address");
                String role = resultSet.getString("role");
                User user = new User(id, name, lastname, address, role);
                users.add(user);
            }
        }
        return users;
    }


	
	public Product createProduct(String name, double price, int quantity) {
		Product product = new Product(nextProductId++, name, price, quantity);
		products.add(product);
		return product;
	}
	
	public User createUser(String name, String lastname, String address, String role) {
		User user = new User(nextUserId++, name, lastname, address, role);
		users.add(user);
		return user;
	}
	
	public Order createOrder(User user) {
		Order order = new Order(nextOrderId++, user);
		orders.add(order);
		return order;
	}
	
	
	public List<Order> getOrders(){
		return orders;
	}

}