public class Student extends Person{
	
	private String codeu;
	
	public Student(String codeu, String name, String sname) {
		super(name, sname);
		
		this.codeu = codeu;
	}
	
	public Student(String codeu, String name, String sname, String role) {
		super(name, sname, role);
		this.codeu = codeu;
	}
	
	public Student(String codeu, String name, String sname, String role, int age) {
		super(name, sname, role, age);
		this.codeu = codeu;
	}
	
	public String getCodeu() {
		return codeu;
	}
	
	public String getName() {
		System.out.println("** Students Info **");
		return name;
	}

	
}
