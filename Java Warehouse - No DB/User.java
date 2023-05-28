
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
