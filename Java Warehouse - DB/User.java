import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private int id;
	private String name;
	private String lastname;
	private String address;
	private String role;
	
	public User(int id, String name, String lastname, String address, String role) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.role = role;
	}
	
	// Database operations
    public void save(Connection connection) throws SQLException {
        String query = "INSERT INTO user (id, name, lastname, address) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, lastname);
            statement.setString(4, address);
            statement.setString(5, role);
            statement.executeUpdate();
        }
    }

    public void updateName(Connection connection) throws SQLException {
        String query = "UPDATE user SET name = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.executeUpdate();
        }
    }
    
    public void updateAddress(Connection connection) throws SQLException {
    	String query = "UPDATE user SET address = ? WHERE id = ?";
    	try (PreparedStatement statement = connection.prepareStatement(query)){
    		statement.setString(4, address);
    		statement.executeUpdate();
    	}
    }

    public void delete(Connection connection) throws SQLException {
        String query = "DELETE FROM user WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
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
	
	public String getRole() {
		return role;
	}
			

}