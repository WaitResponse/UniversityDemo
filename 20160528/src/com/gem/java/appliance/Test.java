package com.gem.java.appliance;

public class Test {	
	public static void main(String[] args) {
		Menu m=new Menu();
		
		
		boolean flag=true;
	while(flag){
		int slt=m.showMainMenu();
		switch(slt){
		case 1:
			m.addAppliance();
			break;
		case 2:
			m.showAppliance();
			break;
		case 3:
			m.showApplianceByType();
			break;
		case 4:
			m.modify();
			break;
		case 5:
			m.delAppliance();
			break;
		case 6:
			m.shopping();
			break;
		case 7:
			m.pay();
			break;
		case 0:
			flag=m.exits();
			break;
		default:
			break;
		}																				
	}
	System.out.println("谢谢使用，再见！");
}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

