package com.gem.java.fruit;

public class Fruit {
	private String fname;//ˮ������
	private double price;//ˮ���۸�
	private int count;//ˮ�����
	private String detail;//ˮ������
	
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
	
	//��ʾˮ����Ϣ
	public void showInfo(){
		System.out.println(getFname()+"\t"+getPrice()+"\t"+getCount()+"\t"+getDetail());
		
	}
}
