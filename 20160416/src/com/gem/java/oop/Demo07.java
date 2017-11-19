package com.gem.java.oop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo07 {
	public static void main(String[] args) {
		Set <Person>set=new HashSet<Person>();
	
				
		System.out.println(set.size());
	/*	for(String str:set){
			System.out.println(str);//增强for循环
		}*/
		
/*		
		Object []obj=set.toArray();
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}*/
		Iterator<Person> ite=set.iterator();
		while(ite.hasNext()){//判断下个值(从head到tail)是否为空，如果为空则返回false，如果不为空则返回true
			Person Per=ite.next();
			System.out.println(Per);
		
			
		}
	}


	}
		

