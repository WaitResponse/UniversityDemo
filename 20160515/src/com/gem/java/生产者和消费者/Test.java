package com.gem.java.�����ߺ�������;

public class Test {
	public static void main(String[] args) {
		Container container=new Container();//������ʵ����һ��Container��ȷ�������̷߳���ͬһ������
		Produce wdl=new Produce("�����",container);
		Produce wp=new Produce("�����",container);
		Consumer pjl=new Consumer("�˽���",container);
		Consumer xmq=new Consumer("������",container);
		
		wdl.start();
		wp.start();
		pjl.start();
		xmq.start();
		
		
	}
}