package University2;

public class Professor extends Person {
	
	private String subject;
	private String salary;
	
	public Professor(String name, String sname, String role, int age, String subject, String salary) {
		super(name, sname, role, age);
		this.subject = subject;
		this.salary = salary;
	}
	
	public Professor(String name, String sname, String role, int age, String subject) {
		super(name, sname, role, age);
		this.subject = subject;
		this.salary = "None";
	}
	
	
	public String getSubject() {
		return subject;
	}
	
	public String getSalary() {
		return salary;
	}

}
