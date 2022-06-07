package test;

public class Address {

	private String number;
	private String street;
	private String zipCode;
	private String province;
	private String mobilePhone;
	
	
	public Address(String number, String street, String zipCode, String province, String mobilePhone) {
		super();
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.province = province;
		this.mobilePhone = mobilePhone;
	}
	//setter
	public void setNumber(String number) {
		this.number = number;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	//getter
	public String getNumber() {
		return this.number;
	}
	public String getStreet() {
		return this.street;
	}
	public String getZipCode() {
		return this.zipCode;
	}
	public String getProvince() {
		return this.province;
	}
	public String getMobilePhone() {
		return this.mobilePhone;
	}	
	
}
