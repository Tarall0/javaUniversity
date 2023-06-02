import java.sql.*;

public class Product extends Warehouse {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(int id, String name, double price, int quantity, int id_warehouse) {
		super(id_warehouse);
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
	
	public void takeOne() {
		this.quantity = quantity - 1;
	}
	

}
