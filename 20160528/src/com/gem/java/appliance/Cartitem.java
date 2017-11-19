package com.gem.java.appliance;

import java.io.Serializable;

public class Cartitem implements  Serializable{ 
	
	private Appliance appliance;
	private int buycount;
	
	
	public Cartitem(){}


	public Cartitem(Appliance appliance, int buycount) {
		super();
		this.appliance = appliance;
		this.buycount = buycount;
	}


	public Appliance getAppliance() {
		return appliance;
	}


	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}


	public int getBuycount() {
		return buycount;
	}


	public void setBuycount(int buycount) {
		this.buycount = buycount;
	}


	
}
