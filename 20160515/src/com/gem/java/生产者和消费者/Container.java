package com.gem.java.生产者和消费者;

public class Container {
	public int count=5;
	
	public synchronized void zuomantou() throws InterruptedException{
		String tname=Thread.currentThread().getName();
		if(count>=10){
			System.out.println(tname+"睡觉去了！！！");
			this.wait();
		}else if(count>=7){
			System.out.println("框子快满了，快起来吃啊！！！！");
			this.notify();
		}if(count<10){
			count++;
			System.out.println(tname+"正在做馒头:"+count);
		}
	
	}
	
	public synchronized void  chimantou() throws InterruptedException{
		String tname=Thread.currentThread().getName();
		if(count<=0){
			System.out.println(tname+"睡觉去了");
			this.wait();
		}else if(count<=3){
			System.out.println("框子里快没馒头了，快起来做馒头！！！");
			this.notify();
		}if(count>0){
			count--;
			System.out.println(tname+"正在吃馒头:"+count);
		}
	}
	
}
