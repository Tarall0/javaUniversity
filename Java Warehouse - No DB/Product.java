package eTivityWarehouses;

public class Product extends Warehouse{
	
	private int id;
	private double price;
	private String desc;
	private int quantity;

	
	public Product(int id, double price, String desc, int quantity, int id_warehouse) {
		super(id_warehouse);
		this.id = id;
		this.price = price;
		this.desc = desc;
		this.quantity = quantity;
		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getID() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setOrder() {
		this.quantity = quantity -1;
	}

}
