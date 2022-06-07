package test;

public class Customer {
	private int id;
	private String name;
	private String type;
	
	private Address address;
	
	public void info(Customer cust) {
		System.out.println("Customer Name : "+cust.getName()+" Type : " + cust.getType());
		System.out.println("Address : " + cust.getAddress().getStreet()+", Postal Code : "+ cust.getAddress().getZipCode()+", "+ cust.getAddress().getProvince());
		System.out.println("Mobile Phone : " + cust.getAddress().getMobilePhone());
	}
	
	public Customer(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
