package com.gem.java.���߳�;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Demo03 {
	public static void main(String[] args) throws InterruptedException {
		Thread01 mt=new Thread01("b");
	for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName()+"-->"+i);
			
		if(i==5){
		    mt.start();
		    mt.join();//��i=5��ʱ���߳̿�ʼ���У����õ�join()���������̴߳�5��ʼ���е�������Ȼ��ʼmain�߳�
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
		System.out.println(Thread.currentThread().getName()+"-->"+"�������");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}