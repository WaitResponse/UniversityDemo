package com.gem.java.∂‡œﬂ≥Ã;

public class MyThread02 extends Thread {

	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
	}
}
