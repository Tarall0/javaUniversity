import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Product  {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	
	}
	
	public Product(int id) {
		this.id = id;
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(int id, String name, double price, int quantity) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void save(Connection connection) throws SQLException {
        String query = "INSERT INTO products (id, name, price, quantity) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setDouble(3, price);
            statement.setInt(4, quantity);
            statement.executeUpdate();
        }
    }
	
	public void del(Connection connection) throws SQLException {
		String query = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
	
	public void upd(Connection connection, int productId, String editName, double newPrice, int editQuantity) throws SQLException {
		String query = "UPDATE products SET name=?, price=?, quantity=? WHERE id=?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
        	statement.setString(1, editName);
            statement.setDouble(2, newPrice);
            statement.setInt(3, editQuantity);
            statement.setInt(4, productId);
            statement.executeUpdate();
        }
    }
	
	public void updateleft(Connection connection, int productId, int product_left)throws SQLException {
		String query = "UPDATE products SET quantity = ? WHERE id=?";
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, product_left);
			statement.setInt(2, productId);
            statement.executeUpdate();
        }
	}

	// Methods to get values from Product
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getname() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// Methods to set new values Product
	
	public void setPrice(double edit_price) {
		this.price = edit_price;
	}
	
	public void setName(String edit_name) {
		this.name = edit_name;
	}
	
	public void setQuantity(int edit_quantity) {
		this.quantity = edit_quantity;
	}
	
	public void takeOne() {
		this.quantity = quantity - 1;
	}
	

}
