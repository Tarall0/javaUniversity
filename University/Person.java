public class Person {
	
	protected String name;
	private String sname;
	private String role;
	private int age;
	
	public Person(String name, String sname, String role, int age) {
		this.name = name;
		this.sname = sname;
		this.role = role;
		this.age = age;
	}
	
	public Person(String name, String sname) {
		this.name = name;
		this.sname = sname;
		this.role = "Not specified";
		this.age = 0;
	}
	
	public Person(String name, String sname, String role) {
		this.name = name;
		this.sname = sname;
		this.role = role;
		this.age = 0;
	}
	
	/**Setter Methods **/
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	/** Getter Methods **/
	
	public String getName() {
		System.out.println(" ** User details **");
		return name;
	}
	
	public String getSname() {
		return sname;
	}
	
	public String getRole() {
		return role;
	}
	
	public int getAge() {
		return age;
	}
	

}

