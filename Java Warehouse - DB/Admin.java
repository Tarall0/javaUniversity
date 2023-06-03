
public class Admin extends User {
	private String rank;

	public Admin(int id, String name, String lastname, String address, String role, String rank) {
		super(id, name, lastname, address, role);
		this.rank = rank;
	}
}
