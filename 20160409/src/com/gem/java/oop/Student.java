package com.gem.java.oop;

public class Student {
	private String sname ;
	private int age ;
	
	//setter
	public void setSname(String sn){
		if("����".equals(sn)){
			System.out.println("����̫������");
			sname= "����";
		}else{
			sname = sn ;
		}
	}
	public void setAge(int a){
		if(a<0 || a>200){
			System.out.println("����Ƿ���");
			age = 18 ;
		}else{
			age =  a ;
		}
	}
	
	//getter
	public String getSname(){
		return sname;
	}
	public int getAge(){
		return age ;
	}
	
	
	void introduceSelf(){
		System.out.println("��Һã�����"+sname+"������"+age+"�꣡");
	}
}

/*
������Ҫ��һЩ���ƣ�������ʹ����"Ϊ����Ϊ"

����˽�С���������

*/