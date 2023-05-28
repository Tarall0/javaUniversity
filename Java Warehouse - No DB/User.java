package eTivityWarehouses;

public class User {
	private int id;
	private String name;
	private String sname;
	private String address;
	private String role;
	
	public User(int id, String name, String sname, String address, String role) {
		this.id = id;
		this.name = name;
		this.sname = sname;
		this.address = address;
		this.role = role;
	}
	
	public int getUserID() {
		return id;
	}
	
	public String getUsername() {
		return name;
	}
	
	public String getLastname() {
		return sname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String role() {
		return role;
	}
}
