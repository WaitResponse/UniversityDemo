package com.gem.java.�����ߺ�������;

public class Container {
	public int count=5;
	
	public synchronized void zuomantou() throws InterruptedException{
		String tname=Thread.currentThread().getName();
		if(count>=10){
			System.out.println(tname+"˯��ȥ�ˣ�����");
			this.wait();
		}else if(count>=7){
			System.out.println("���ӿ����ˣ��������԰���������");
			this.notify();
		}if(count<10){
			count++;
			System.out.println(tname+"��������ͷ:"+count);
		}
	
	}
	
	public synchronized void  chimantou() throws InterruptedException{
		String tname=Thread.currentThread().getName();
		if(count<=0){
			System.out.println(tname+"˯��ȥ��");
			this.wait();
		}else if(count<=3){
			System.out.println("�������û��ͷ�ˣ�����������ͷ������");
			this.notify();
		}if(count>0){
			count--;
			System.out.println(tname+"���ڳ���ͷ:"+count);
		}
	}
	
}
