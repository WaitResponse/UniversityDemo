package com.gem.java.异常和文件;

public class Demo01 {//抛给java虚拟机处理
	public static void main(String[] args)throws Exception {
		Demo01 d=new Demo01();
		/*try{
			d.m1();
		}catch(Exception e){
			e.printStackTrace();
		}	自己处理	
*/
		
		d.m1();
	}
	
	public void m1() throws Exception {
		System.out.println("========");
	}
	
	
}
