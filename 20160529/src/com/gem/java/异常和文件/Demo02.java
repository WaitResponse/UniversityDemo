package com.gem.java.�쳣���ļ�;

public class Demo02 {
	public static void main(String[] args) {
		Demo02 d=new Demo02();
		try {
			d.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	void m1()throws Exception{
		System.out.println("========");
		throw new Exception("��Ϲ������");//�˴��������ܳ��쳣
	}
}
