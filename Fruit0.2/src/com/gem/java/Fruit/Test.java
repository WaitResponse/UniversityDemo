package com.gem.java.Fruit;

public class Test {
	public static void main(String[] args) {
		Menu m=new Menu();
		
		boolean flag=true;
		while(flag){
			int slt=m.showMainMenu();
			switch(slt){
			case 1:
				m.showFruit();
				break;
			case 2:
				m.addFruit();
				break;
			case 3:
				m.delFruit();
				break;
			case 4:
				m.showFruitByCountAsc();
				break;
			case 5:
				flag=m.exit();
				break;
				default:
					System.out.println("你不按套路出牌");
					break;
			}
		}
		System.out.println("谢谢使用，再见！");
	}

	
}
