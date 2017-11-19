package com.gem.java.fruit;

public class Fruit {
	private String fname;//水果名称
	private double price;//水果价格
	private int count;//水果库存
	private String detail;//水果描述
	
	public Fruit(){}

	public Fruit(String fname, int price,String detail) {
		super();
		this.fname = fname;
		this.price = price;
		this.count = 100;
		this.detail = detail;
	}

	public Fruit(String fname, double price, int count, String detail) {
		super();
		this.fname = fname;
		this.price = price;
		this.count = count;
		this.detail = detail;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getPrice() {
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
	
	//显示水果信息
	public void showInfo(){
		System.out.println(getFname()+"\t"+getPrice()+"\t"+getCount()+"\t"+getDetail());
		
	}
}
