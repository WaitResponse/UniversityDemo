package com.gem.java.∂‡œﬂ≥Ã;

public class Demo02 {
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		
		
		t1.start();
		t2.start();
		t3.start();
	}
}
	class MyThread implements Runnable{
		public void run(){
			for(int i=0;i<100;i++){
				String str=" ";
				for (int j = 0; j < 15000; j++) {
					str=str+" "+j;
				}
				System.out.println(Thread.currentThread().getName()+"-->"+i);
			}
		}
	}
	
	
	

