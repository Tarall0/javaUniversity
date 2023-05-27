package University;

public class Professor extends Person{
	private String subject;
	
	public Professor(String subject, String name, String sname, String role) {
		super(name, sname, role);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

}
