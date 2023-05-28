package eTivityWarehouses;

public class Warehouse {
	
	protected int id_warehouse;
	private String location;

	
	public Warehouse(int id_warehouse, String location) {
		this.id_warehouse = id_warehouse;
		this.location = location;

	}
	
	public Warehouse(int id_warehouse) {
		this.id_warehouse = id_warehouse;
	}
	
	public int getIdWarehouse() {
		return id_warehouse;
	}
	
	public String getLocation() {
		return location;
	}
	

	
	public void editWarehouse() {
		System.out.println("Do you want to edit warehouse info?");
	}

}
