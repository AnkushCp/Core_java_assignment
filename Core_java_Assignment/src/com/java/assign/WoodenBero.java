package com.java.assign;

public class WoodenBero extends Bero{
	private String woodType="";

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	public WoodenBero(String beroType, String beroColour,String woodType) {
		super(beroType, beroColour);
		this.woodType=woodType;
		calculatePrice();
		// TODO Auto-generated constructor stub	
	}
	public void calculatePrice()
	{
		if(this.woodType.equals("Ply Wood"))
		{
			this.setPrice(15000);
		}
		if(this.woodType.equals("Teak Wood"))
		{
			this.setPrice(12000);
		}
		if(this.woodType.equals("Engineered Wood"))
		{
			this.setPrice(10000);
		}
		
	}
}
