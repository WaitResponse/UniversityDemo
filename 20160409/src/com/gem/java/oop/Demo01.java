package com.gem.java.oop;

public class Demo01 {
	public static void main(String[] args) {
		Demo01 d = new Demo01();
		for(int i = 1 ; i<=10 ; i++){
			int count = d.getTZ(i);
			System.out.println("第"+i+"天："+count+"个！");
		}
	}
	
	//你告诉我第几天，我告诉你当天桃子数量
	int getTZ(int day){
		if(day==10){
			return 1 ;
		}else{
			return (getTZ(day+1)+1)*2 ;
		}
	}
}

/*

猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 
第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。


*/