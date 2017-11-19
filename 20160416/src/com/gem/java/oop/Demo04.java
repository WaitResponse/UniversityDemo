package com.gem.java.oop;

public  class Demo04 {
	
	private String name;
	private int age;
	
	public Demo04(){}
	public static void Hello(){
		System.out.println("ÄãºÃ");
	}
	public void introduce(){		
		Hello();
		System.out.println("ĞÕÃû£º"+name+"ÄêÁä:"+age);
	}
	public Demo04(String name,int age){
		this.name=name;
		this.age=age;
	}
		

}


