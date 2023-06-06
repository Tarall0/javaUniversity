import java.util.*;
import java.sql.*;

class Order {
    private int id;
    private User user;
    private List<Product> products;

    public Order(int id, User user, List<Product> products) {
        this.id = id;
        this.user = user;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void addProduct(Product product) {
		products.add(product);
	}

    public void setProducts(List<Product> products) {
        this.products = products;
    }

  
    // Database operations
    public void save(Connection connection) throws SQLException {
        String query = "INSERT INTO orders (id, user, products) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setInt(2, user.getUserId());
            statement.setString(3, products.toString());
            statement.executeUpdate();
        }
    }

    public void update(Connection connection) throws SQLException {
        String query = "UPDATE orders SET user = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, user.getUserId());
            statement.setInt(2, id);
            statement.executeUpdate();
        }
    }

    public void delete(Connection connection) throws SQLException {
        String query = "DELETE FROM orders WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
   
}
