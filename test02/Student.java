package com.gem.java.object;

class Student {
	String name;
	String address;
	int number;
	void Introduce (){
		System.out.println("大家好，我叫"+name+"，来自"+address+"，请大家多多关照");
	}
	public static void main(String[] args){
		Student student=new Student();
		student.name="陈东文";
		student.address="江西科技师范大学";
		student.number=20156312;
		student.Introduce();	
	}
}
