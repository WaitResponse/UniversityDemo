package com.gem.java.oop;

import java.util.Set;
import java.util.TreeSet;

public class Demo09 {
	public static void main(String[] args) {
		Set<Student> set=new TreeSet<Student>(new AgeAsc());//自定义排序
		
		Student s1=new Student("jim",20,1008615);
		Student s2=new Student("tom",25,1008611);
		Student s3=new Student("lina",16,1008645);
		Student s4=new Student("jack",23,1008609);
		Student s5=new Student("jim",20,1008615);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for(Student stu : set){
			if("jim".equals(stu.getName())){
				System.out.println(stu);
			}else{
				System.out.println("没有该学生");
			}
		}
	}
}
