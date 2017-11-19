package com.gem.java.oop;

public class Demo04 {
	public static void main(String[] args) {
		Person person = new Person();
		person.pname = "张三";
		person.age = 20 ;
//		person.tel = "13800138000"; //此处报错，因为tel是私有的，仅仅是本类可见
		
	}
}
