package com.gem.java.�����ߺ�������;

public class Produce extends Thread{
	//Container container=new Container();
	private Container container;
	public Produce(){}
	public Produce(String name,Container container){
		super(name);
		this.container=container;
	}
	public  void run(){
		try {
			while(true){
				container.zuomantou();
				Thread.sleep(400);
			}			
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
}
