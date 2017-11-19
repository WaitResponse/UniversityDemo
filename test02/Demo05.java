package com.gem.java.object;

import java.util.concurrent.SynchronousQueue;

import javax.sound.midi.Synthesizer;

public class Demo05 {
	public static void main(String[] args) throws InterruptedException {
		Card card=new Card();
		XiaoMing xm = new XiaoMing(card);
		Likn lk = new Likn(card);
		xm.setPriority(Thread.MAX_PRIORITY);
		
		xm.start();
		lk.start();
		
		Thread.sleep(800);
		System.out.println("当前余额"+card.count);
	}
	}
	
	
	 class Card{
		public int count=1000;
		
		public synchronized void   koukuan(int money){
			String tname=Thread.currentThread().getName();
			System.out.println(tname+"正在执行...");
				
			if(money<=count){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count=count-money;
				System.out.println(tname+"扣款成功!");
			}else{
				System.out.println(tname+"余额不足！");
			}
			}			
		}		
	
	 
class XiaoMing extends Thread{
	public Card card;
	public XiaoMing(){}
	public XiaoMing(Card card){
		super("小明");
		this.card=card;
	}
		public void run() {
			card.koukuan(700);			
		}
		
	}
	
class Likn extends Thread{
	public Card card;
	public Likn(){}
	public Likn(Card card){
		super("妮可");
		this.card=card;
	}
		public void run() {
			card.koukuan(900);			
		}
		
	}
