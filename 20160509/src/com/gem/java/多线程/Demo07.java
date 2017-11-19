package com.gem.java.多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;





public class Demo07 {
	public static void main(String[] args) throws InterruptedException {
		
		Card3 card=new Card3();
		xiaoming xm=new xiaoming("小明",card);
		xiaohong xh=new xiaohong("小红",card);
		
		
		xm.start();
		xh.start();
		
		Thread.sleep(1000);
		System.out.println("当前余额为"+card.count);
	}
	}
class Card3{
	public int count=1000;
	private Lock lock=new ReentrantLock(); 
	
	public  void kouqian(int money){
		String tname=Thread.currentThread().getName();
		 System.out.println(tname+"正在执行...");
		 lock.lock();
		try{
			if(money<=count){
			try{
			Thread.sleep(500);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			count=count-money;
			System.out.println(tname+"扣款成功！");
		}else{
			System.out.println(tname+"余额不足");
		}
		}
		finally{
			lock.unlock();
	}
}
} 


class xiaoming extends Thread{
	public Card3 card;
	public xiaoming(){}
	public xiaoming(String name,Card3 card){
		super(name);
		this.card=card;
	}
	public void run(){
		card.kouqian(600);
	}
}
class xiaohong extends Thread{
	public Card3 card;
	public xiaohong(){}
	public xiaohong(String name,Card3 card){
		super(name);
		this.card=card;
	}
	public void run(){
		card.kouqian(500);
	}
}