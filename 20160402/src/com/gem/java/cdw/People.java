package com.gem.java.cdw;

public class People {
	String name;
	int age;
	String address;	 
	void eat(){
		System.out.println("���ڳԷ�");
	}
	void run(){
		System.out.println("���ڱ���");
	}
	void sleep(){
		System.out.println("����˯��");
	}
	void introduceSelf(){
		System.out.println("��Һã��ҽ�"+name+"������"+age+"�꣬"+"����"+address);
	}
	
	public static void main(String[] args) {
		People per=new People();
		per.name="��ΰ";
	    per.age=25;
		per.address="��������";
		per.run();
		per.sleep();
		per.introduceSelf();
	}
	

}
