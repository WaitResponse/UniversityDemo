package com.gem.java.oop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo07 {
	public static void main(String[] args) {
		Set <Person>set=new HashSet<Person>();
	
				
		System.out.println(set.size());
	/*	for(String str:set){
			System.out.println(str);//��ǿforѭ��
		}*/
		
/*		
		Object []obj=set.toArray();
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}*/
		Iterator<Person> ite=set.iterator();
		while(ite.hasNext()){//�ж��¸�ֵ(��head��tail)�Ƿ�Ϊ�գ����Ϊ���򷵻�false�������Ϊ���򷵻�true
			Person Per=ite.next();
			System.out.println(Per);
		
			
		}
	}


	}
		

