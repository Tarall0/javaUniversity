import java.sql.*;

public class User {
	private int id;
	private String name;
	private String lastname;
	private String address;
	
	public User(int id, String name, String lastname, String address) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
	}
	
	public void save(Connection connection) throws SQLException {
        String query = "INSERT INTO products (id, name, price) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, lastname);
            statement.setString(4, address);
            statement.executeUpdate();
        }
    }
	
	public int getUserId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getAddress() {
		return address;
	}
			

}
