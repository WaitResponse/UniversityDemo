package com.gem.java.多线程;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Demo03 {
	public static void main(String[] args) throws InterruptedException {
		Thread01 mt=new Thread01("b");
	for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName()+"-->"+i);
			
		if(i==5){
		    mt.start();
		    mt.join();//当i=5的时候，线程开始运行，调用的join()方法会让线程从5开始运行到死亡，然后开始main线程
		}
		Thread.sleep(200);
	}
	
	}
}
class Thread01 extends Thread{
	public Thread01(){}
	public Thread01(String name){
		super(name);
	}
	public void run(){
	for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName()+"-->"+"我是你爹");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}