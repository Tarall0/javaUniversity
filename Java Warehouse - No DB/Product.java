
public class Product extends Warehouse {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(int id, String name, double price, int quantity, int id_warehouse) {
		super(id_warehouse);
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getname() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	

}
