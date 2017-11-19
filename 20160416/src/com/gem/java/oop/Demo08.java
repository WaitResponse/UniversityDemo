package com.gem.java.oop;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) {
		Set<Person> set=new TreeSet<Person>();
		
		Person p1=new Person("盖伦",25,182,180);
		Person p2=new Person("杰斯",23,184,146);
		Person p3=new Person("提莫",15,135,85);
		Person p4=new Person("科加斯",100,230,605);
		Person p5=new Person("杰斯",23,184,146);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
				
		Iterator<Person> ite=set.iterator();
		while(ite.hasNext()){   //判断下个值(从head到tail)是否为空，如果为空则返回false，如果不为空则返回true
			Person Per=ite.next();	
			if("杰斯".equals(Per.getName())){
			System.out.println(Per);
		}else{
			System.out.println("没有该学生");
			break;
		}	
	}	
		
	
	
	}
}
