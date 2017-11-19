package com.gem.java.继承;
//子类
public class BianFu extends Animal{
	
	String name ;

	//子类确实具有睡觉这个方法，但是不太同意父类的睡姿,需要重写睡觉方法
	public void sleep() {
		System.out.println("挂着睡....");
		//我只想调用父类中的hello方法
		super.hello();
	}
	
	//重写
	public void hello(){
//		System.out.println(super.name);
		System.out.println("BianFu hello....");
	}
}
/*
重写：
1)父子类之间同名方法的关系
2)两个方法长的一模一样
3)子类不能缩小父类的访问修饰符
4)子类不能抛出比父类更大的异常
*/

//在java中，继承只允许单根继承
//通过super调用父类的方法.通过super可以调用父类的属性和方法
//super父类对象；this当前对象