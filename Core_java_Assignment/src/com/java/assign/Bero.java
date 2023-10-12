package com.java.assign;

public abstract class Bero {
	protected String beroType="";
	protected String beroColour="";
	protected double price=0;
	

	public String getBertotype() {
		return beroType;
	}


	public void setBertotype(String beroType) {
		this.beroType = beroType;
	}


	public String getBerocolour() {
		return beroColour;
	}


	public void setBerocolour(String beroColour) {
		this.beroColour = beroColour;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void calculatePrice();
	public Bero(String beroType,String beroColour) {
		
		this.beroType=beroType;
		this.beroColour=beroColour;

	}

}
