package com.gem.java.多线程;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Demo04 {
	public static void main(String[] args) {
		Thread02 m1=new Thread02("B");
		Thread02 m2=new Thread02("C");
		Thread02 m3=new Thread02("D");
		
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.NORM_PRIORITY);
		m3.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
		m3.start();
	}
}
class Thread02 extends Thread{
	public Thread02(){}
	public Thread02(String name){
		super(name);
	}
	public void run(){
	for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName()+"-->"+"我是你爹");
	}
	}
}