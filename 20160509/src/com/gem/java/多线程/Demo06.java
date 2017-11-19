package com.gem.java.∂‡œﬂ≥Ã;

public class Demo06 {
	public static void main(String[] args) {
		Card2 card=new Card2();
		
		Threada1 t1=new Threada1("A");
		t1.card=card;
		t1.start();
		
		
		
		
		Threada1 t3=new Threada1("B");
		t3.card=card;
		t3.start();
		
		
	}
}


class Threada1 extends Thread{
	public Card2 card;
	public Threada1(){}
	public Threada1(String name){
		super(name);
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i+"    "+card.m1());
		}
	}
}

class Card2{
	public synchronized String m1(){
		if(Thread.currentThread().getName().startsWith("A")){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			this.notifyAll();
			//this.notify();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Thread.currentThread().getName();
	}
}