package com.gem.java.oop;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) {
		Set<Person> set=new TreeSet<Person>();
		
		Person p1=new Person("����",25,182,180);
		Person p2=new Person("��˹",23,184,146);
		Person p3=new Person("��Ī",15,135,85);
		Person p4=new Person("�Ƽ�˹",100,230,605);
		Person p5=new Person("��˹",23,184,146);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
				
		Iterator<Person> ite=set.iterator();
		while(ite.hasNext()){   //�ж��¸�ֵ(��head��tail)�Ƿ�Ϊ�գ����Ϊ���򷵻�false�������Ϊ���򷵻�true
			Person Per=ite.next();	
			if("��˹".equals(Per.getName())){
			System.out.println(Per);
		}else{
			System.out.println("û�и�ѧ��");
			break;
		}	
	}	
		
	
	
	}
}
