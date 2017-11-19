package com.gem.java.访问修饰符2;

public class Demo01 {
	public static void main(String[] args) {
		Demo01 d=new Demo01();
		d.hello();
		Demo01.sleep();//静态方法可以直接通过类名.调用
	}

	
	 void hello(){
		System.out.println("你好");
	}
	 
	 static void sleep(){
		 System.out.println("站着睡觉");
	 }
	 
}
