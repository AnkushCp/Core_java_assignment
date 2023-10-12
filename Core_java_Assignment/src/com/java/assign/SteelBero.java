package com.java.assign;

public class SteelBero extends Bero {
	private int beroHeight=0;
	
	public int getHeight() {
		return beroHeight;
	}

	public void setHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType,beroColour);
		this.beroHeight=beroHeight;
		calculatePrice();
		// TODO Auto-generated constructor stub
	}
	public void calculatePrice()
	{
		if(beroHeight==3)
		{
			this.setPrice(5000);
		}
		if(beroHeight==5)
		{
			this.setPrice(8000);
		}
		if(beroHeight==7)
		{
			this.setPrice(10000);
		}
	}


}
