package com.gem.java.appliance;

import java.io.Serializable;

public class Appliance implements Serializable{
	private String name;
	private String date;
	private String type;
	private int price;
	private int count;

	public Appliance() {}

	public Appliance(String type,String name, int price,int count,String date) {
		super();
		this.name = name;
		this.date = date;
		this.type = type;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return type + "\t" + name + "\t" + price + "\t" + count + "\t\t" + date;
	}
}