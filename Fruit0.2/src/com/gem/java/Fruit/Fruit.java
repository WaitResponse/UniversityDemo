package com.gem.java.Fruit;

public class Fruit {
	private String name;
	private int price;
	private int count;
	private String detail;
	
	public Fruit(){}
	
	
	public Fruit(String name, int price, int count, String detail) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.detail = detail;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public String toString(){
	return name+"\t"+price+"\t"+count+"\t"+detail;
}


}
