package com.gem.java.生产者和消费者;

public class Test {
	public static void main(String[] args) {
		Container container=new Container();//在这里实例化一个Container，确保所有线程访问同一个对象
		Produce wdl=new Produce("武大郎",container);
		Produce wp=new Produce("武大郎",container);
		Consumer pjl=new Consumer("潘金莲",container);
		Consumer xmq=new Consumer("西门庆",container);
		
		wdl.start();
		wp.start();
		pjl.start();
		xmq.start();
		
		
	}
}