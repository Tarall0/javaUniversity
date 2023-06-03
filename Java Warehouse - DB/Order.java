import java.util.*;
import java.sql.*;

class Order {
    private int id;
    private User user;
    private static List<Product> products;

    public Order(int id, User user) {
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

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    // Database operations
    public void save(Connection connection) throws SQLException {
        String query = "INSERT INTO orders (id, user) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setInt(2, user.getUserId());
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