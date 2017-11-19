package com.gem.java.异常和文件;

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
		throw new Exception("蹦瞎卡拉卡");//此处真正的跑出异常
	}
}
