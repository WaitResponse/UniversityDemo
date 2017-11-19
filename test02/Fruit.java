package com.gem.java.object;

 class Fruit {
	String name;
	int price;
	String address;
	Fruit(){}
	Fruit(String n,int p,String a){ 
		name=n;
		price=p;
		address=a;
	}
	public static void main(String[] args){
		Fruit fruit=new Fruit("红富士",15,"山东");
		System.out.println(fruit.name);
	}
}
