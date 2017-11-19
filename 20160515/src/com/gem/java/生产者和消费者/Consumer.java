package com.gem.java.生产者和消费者;

public class Consumer extends Thread{
	//Container container=new Container();
	
	private Container container;
	public Consumer(){}
	public Consumer(String name,Container container){
		super(name);
		this.container=container;
	}
	public  void run(){
		try {
			while(true){
				container.chimantou();
				Thread.sleep(1000);
			}			
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
}
