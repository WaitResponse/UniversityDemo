package com.gem.java.object;

public class phone {
		String name;
		String brand;
		int price;
		void call(){
			System.out.println("打电话");
		}
		void sendMsg(){
			System.out.println("发短信");
		}
 public static void main(String[] args){
	 phone p1=new phone();
	  	p1.name="iphone";
	  	p1.price=6599;
	  		System.out.println(p1.name);
	  		p1.call();
 }
}

