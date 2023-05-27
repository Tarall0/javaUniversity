package University;

public class Student extends Person{
	private String codeu;
	
	public Student(String codeu, String name, String sname, String role) {
		super(name, sname, role);
		
		this.codeu = codeu;
	}
	
	public String getCodeu() {
		return codeu;
	}
}
