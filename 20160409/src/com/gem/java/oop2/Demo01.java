package com.gem.java.oop2;

import com.gem.java.oop.Person;

public class Demo01 {
	public static void main(String[] args) {
		Person person = new Person();
		person.pname = "张三";
//		person.age = 20 ; //此处编译报错，因为不在同一个包内
	}
}
