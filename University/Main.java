package University;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("ITI420","Francesco","Tarantino","Student");
		Professor p1 = new Professor("Informatics Engineer", "Jhon", "Snow", "Professor");
		
		System.out.println("Matricola: "+s1.getCodeu());
		System.out.println("Name: "+s1.getName());
		System.out.println("Last Name: "+s1.getSname());
		System.out.println("Role: "+s1.getRole());
		
		System.out.println("-------------------------------");
		
		System.out.println("Subject: "+p1.getSubject());
		System.out.println("Name: "+p1.getName());
		System.out.println("Last Name: "+p1.getSname());
		System.out.println("Role: "+p1.getRole());

	}

}
