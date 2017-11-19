package com.gem.java.oop;

public class Demo01 {
	public static void main(String[] args) {
		Demo01 d=new Demo01();
		for(int i=1;i<=10;i++){
			int count=d.getTZ(i);
			System.out.println("第"+i+"天的桃子数量为："+count);
		}
	}
	
	//你告我我天数，我得出当天桃子的数量
	public int getTZ(int day){
		if(day==10){
			return 1;
		}else{
			return (getTZ(day+1)+1)*2;
		}
		
	}
	
}
