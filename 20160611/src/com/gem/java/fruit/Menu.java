package com.gem.java.fruit;

import java.util.Scanner;

public class Menu {
	private Scanner input=new Scanner(System.in);
	private Fruit []fruits=new Fruit[20];
	private int size=0;//记录水果的数量
	
	//初始化数据
	public void initData(){
		Fruit f01=new Fruit("苹果",5,100,"红富士，杠杠的！");
		Fruit f02=new Fruit("凤梨",12,224,"台湾凤梨，杠杠的！");
		Fruit f03=new Fruit("西瓜",12,363,"沙土西瓜，杠杠的！");
		
		fruits[0]=f01;
		fruits[1]=f02;
		fruits[2]=f03;	
		
		size=3;
	}
	public Menu(){
		initData();
	}
	
	//显示水果列表
	public void showFruits(){
		System.out.println("================水果列表=================");
		showTitle();
		for(int i=0;i<size;i++){
			Fruit fruit=fruits[i];
			fruit.showInfo();
		}
	}
	//显示表头信息
	private void showTitle(){
		System.out.println("名称\t单价(元)\t库存量(kg)\t描述");
	}
	
	
	//显示菜单
	public int showMainMenu(){
		System.out.println("1.**********欢迎使用水果库存管理系统**********");
		System.out.println("1.展示水果列表");
		System.out.println("2.添加新水果");
		System.out.println("3.按照单价升序展示水果信息");
		System.out.println("4.按照库存量升序展示水果信息");
		System.out.println("5.查询特定水果");
		System.out.println("6.退出");
		System.out.print("请选择:");
		 return input.nextInt();
	}
	
	//询问是否继续
	public boolean askContinue(){
		System.out.println("输入任意键继续，输入N退出：");
		return !"N".equalsIgnoreCase(input.next())?true:false;
	}
	
	// 显示特定水果信息
	public void showFruit (){
		System.out.print("请输入水果名称：");	
		String fname=input.next();
		showTitle();
		Fruit fruit=getFruitByFname(fname);
		if(fruit!=null){
			fruit.showInfo();
		}
		else{
			System.out.println("对不起，没有找到有关记录！");
		}
	}
	
	
	//查询特定水果信息
		private Fruit getFruitByFname(String fname){
		for(int i=0;i<size;i++){
			Fruit fruit=fruits[i];
			if(fruit.getFname().equals(fname)){
				//打印水果信息
			return fruit;
			}
		}
		return null;		
	}
	//添加水果
	public void addFruit(){
		System.out.print("请输入水果名称：");
		String fname=input.next();
		Fruit fruit=getFruitByFname(fname);
		
		if(fruit!=null){
			System.out.print("请输入新增的库存量“");
			int count=input.nextInt();
			fruit.setCount(fruit.getCount()+count);			
		}else{
			System.out.print("请输入单价：");
			double price=input.nextDouble();
			
			System.out.print("请输入库存量：");
			int count=input.nextInt();
			
			System.out.print("请输入库描述：");
			String detail=input.next();
						
			fruit=new Fruit(fname, price,count, detail);
			fruits[size++]=fruit;
		}	
		System.out.println("入库成功！");
	}

		// 按照单价升序展示水果信息
		public void showFruitsByPriceAsc(){
			for(int i=0;i<size-1;i++){
				for(int j=i+1;j<size;j++){
					if(fruits[i].getPrice()>fruits[j].getPrice()){
						Fruit temp;
						temp=fruits[i];
						fruits[i]=fruits[j];
						fruits[j]=temp;					
					}				
				}
			}
			showFruits();
		}
		
		//按照库存量展示水果信息
		public void showFruitsByCountAsc(){
			for(int i=0;i<size-1;i++){
				for(int j=i+1;j<size;j++){
					if(fruits[i].getCount()>fruits[j].getCount()){
						Fruit temp;
						temp=fruits[i];
						fruits[i]=fruits[j];
						fruits[j]=temp;		
					}    
				}
			}
			showFruits();
		}
		
		//退出
		public boolean exit(){

			System.out.println("是否要退出?(Y/N)");
			return !"Y".equalsIgnoreCase(input.next());
		}
		
}

		
	

