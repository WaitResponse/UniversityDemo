package com.gem.java.oop;

public class Demo04 {
	public static void main(String[] args) {
		Demo04 d=new Demo04();
		for(int i=1;i<=12;i++){
			System.out.println("第"+i+"个月兔子总数为："+d.getTuzi(i));
		}
	}
		
		int getTuzi(int month){
			if(month==1||month==2){
				return 1;
			}else{
				return getTuzi(month-1)+getTuzi(month-2);
			}
			
		}
	}

