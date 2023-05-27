public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p1 = new Professor("Jhon","Snow","Professor",24, "Java foundamentals", "10000");
		Professor p2 = new Professor("Winston","Churchill","Professor",129, "History");
		
		Student s1 = new Student("ITI420","Francesco","Tarantino","Student", 22);
		Student s2 = new Student("ITI421", "Mary", "Jane");
		
		

		System.out.println("///// Professor(s) /////");
		System.out.println("");
		System.out.println("Name: "+p1.getName());
		System.out.println("Last name: "+p1.getSname());
		System.out.println("Role: "+p1.getRole());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Subject: "+p1.getSubject());
		System.out.println("Salary: "+p1.getSalary());
		System.out.println("");
		System.out.println("-----");
		System.out.println("");
		System.out.println("Name: "+p2.getName());
		System.out.println("Last name: "+p2.getSname());
		System.out.println("Role: "+p2.getRole());
		System.out.println("Age: "+p2.getAge());
		System.out.println("Subject: "+p2.getSubject());
		System.out.println("Salary: "+p2.getSalary());
		System.out.println("");
		System.out.println("--------------------------");
		System.out.println("///// Student(s) /////");
		System.out.println("");
		System.out.println("Name: "+s1.getName());
		System.out.println("Last name: "+s1.getSname());
		System.out.println("Role: "+s1.getRole());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Code: "+s1.getCodeu());
		System.out.println("");
		System.out.println("-----");
		System.out.println("");
		System.out.println("Name: "+s2.getName());
		System.out.println("Last name: "+s2.getSname());
		System.out.println("Role: "+s2.getRole());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Code: "+s2.getCodeu());
		

	}

}

