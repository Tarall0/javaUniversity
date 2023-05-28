
public class Warehouse {
	
	protected int id_warehouse;
	private String location;
	private String status;
	
	public Warehouse(int id_warehouse, String location, String status) {
		this.id_warehouse = id_warehouse;
		this.location = location;
		this.status = status;
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
	
	public String getStatus() {
		return status;
	}

}
