package com.gem.java.多态;

public class B extends A {
		int num=2;
		
		public B(){
			System.out.println("子类自己的默认构造方法");
		}
		public void m1(){			
			System.out.println("B");
		}
		public void m2(){
			System.out.println("子类自己的方法");
		}
	}
	//方法重写


