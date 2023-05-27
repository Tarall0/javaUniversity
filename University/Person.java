package University;

public class Person {
	
	public String name;
	public String sname;
	public String role;
	
	public Person(String name, String sname, String role) {
		this.name = name;
		this.sname = sname;
		this.role = role;
	}
	
	/** Getter Methods */
	
	public String getName() {
		return name;
	}
	
	public String getSname() {
		return sname;
	}
	public String getRole() {
		return role;
	}

}
