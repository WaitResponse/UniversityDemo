package com.gem.java.fruit;

public class Test {
	public static void main(String[] args) {
		Menu m=new Menu();
		
		boolean flag=true;
		while(flag){	
			int slt=m.showMainMenu();
			switch(slt){
			case 1:
				m.showFruits();
				break;
			case 2:
				m.addFruit();
				break;
			case 3:
				m.showFruitsByPriceAsc();
				break;
			case 4:
				m.showFruitsByCountAsc();
				break;
			case 5:
				m.showFruit();
				break;		
			case 6:
				flag=m.exit();
				if(!flag){
				System.out.println("谢谢使用！再见");
				return;				
			}
				break;
			}
			flag=m.askContinue();
		}
		System.out.println("谢谢使用！再见");
	}
}


