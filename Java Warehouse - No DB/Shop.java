import java.util.*;

public class Shop {
	
	private List<Product> products;
	private List<User> users;
	private List<Order> orders;
	private List<Warehouse> warehouses;
	private int nextProductId;
	private int nextUserId;
	private int nextOrderId;
	private int warehouseId;
	
	public Shop() {
		this.products = new ArrayList<>();
		this.users = new ArrayList<>();
		this.orders = new ArrayList<>();
		this.warehouses = new ArrayList<>();
		this.nextProductId = 1;
		this.nextUserId = 1;
		this.nextOrderId = 1;
		this.warehouseId = 1;
	}
	
	public Product createProduct(String name, double price, int quantity, int id_warehouse) {
		Product product = new Product(nextProductId++, name, price, quantity, id_warehouse);
		products.add(product);
		return product;
	}
	
	public User createUser(String name, String lastname, String address) {
		User user = new User(nextUserId++, name, lastname, address);
		users.add(user);
		return user;
	}
	
	public Order createOrder(User user) {
		Order order = new Order(nextOrderId++, user);
		orders.add(order);
		return order;
	}
	
	public Warehouse createWarehouse(int id_warehouse, String location, String status) {
		Warehouse warehouse = new Warehouse(warehouseId++, location, status);
		warehouses.add(warehouse);
		return warehouse;
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public List<Order> getOrders(){
		return orders;
	}

}
