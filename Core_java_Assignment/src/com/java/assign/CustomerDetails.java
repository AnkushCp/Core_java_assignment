package com.java.assign;

public class CustomerDetails {
	private String customerName;
	private long phoneNumber;
	private String address;
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerDetails(String customerName, long phoneNumber, String address) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

//	public CustomerDetails(String customerName,long phoneNumber, String address)
//	{
//		super();
//		this.phoneNumber=phoneNumber;
//		this.address=address;
//		this.customerName=customerName;
//	}

}
