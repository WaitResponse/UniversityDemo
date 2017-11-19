package com.gem.java.Fruit;

import java.util.Scanner;

public class Menu {
	Fruit []fruits= new Fruit[3];
	Scanner input=new Scanner(System.in);
	int size=0;
	
	//初始化水果信息
	{
		Fruit f01=new Fruit("苹果",5,150,"红富士，很甜！");
		Fruit f02=new Fruit("柠檬",12,80,"柠檬，很酸！");
			
		fruits[0]=f01;
		fruits[1]=f02;
		
		size=2;
	}
	
	//显示水果信息
	void showFruit(){
		System.out.println("-----------------------------------------");
		System.out.println("名称\t单价\t库存量\t备注");
		if(size<=0){
			System.out.println("对不起，库存里面没有任何记录！");
		}else{
			for(int i = 0 ; i<size ; i++){
				Fruit fruit = fruits[i];
			System.out.println(fruit);
			}
		}
		
		System.out.println("-----------------------------------------");
	}
	
	
	//添加水果
	void addFruit(){
		System.out.print("请输入名称：");
		String name=input.next();
		int index=getFruit(name);
		if(index==-1){
			System.out.print("请输入单价：");
			int price=input.nextInt();
			System.out.print("请输入库存量：");
			int count=input.nextInt();
			System.out.print("请输入描述：");
			String detail=input.next();
					
			Fruit fruit=new Fruit(name,price,count,detail);	
			fruits[size++]=fruit;
			resizeArray();//根据情况对数组进行扩容
			
		}else{
			System.out.print("请输入追加的库存量:");
			int count = input.nextInt() ;
			Fruit currFruit = fruits[index] ;
			currFruit.setCount(currFruit.getCount() + count);
		}
		System.out.println("添加成功");
	}
	
	
	//查找是否有该水果
	int getFruit(String name){
		for(int i = 0 ; i<size ; i++){
			Fruit currFruit = fruits[i] ;
			if(name.equals(currFruit.getName())){
				return i ;
			}
		}
		return -1 ;
	}
	
	//水果下架
	void delFruit(){
		System.out.print("请输入下架的水果名称：");
		String name = input.next() ;
		int index = getFruit(name);
		if(index==-1){
			System.out.println("对不起，指定的水果不存在！");
		}else{
			System.out.print("是否确认下架？(Y/N)");
			String slt = input.next() ;
			if("Y".equalsIgnoreCase(slt)){			
				for(int i = index ; i<size-1 ; i++){	
					fruits[i] = fruits[i+1];
				}
				fruits[size-1]=null ;
				System.out.println("下架成功！");
				size--;
			}
		}
	}
	
	
	//数组扩容
	void resizeArray(){
		if(size>=fruits.length){
			//1.准备一个更大的数组
			Fruit[] fruits2 = new Fruit[size*2];
			//2.将原始数组中的元素全部复制到新的数组中
			for(int i = 0 ; i < size ; i++){
				fruits2[i] = fruits[i];
			}
			//3.将fruitArr这个引用变量指向新的数组位置
			fruits = fruits2 ;
		}
	}
	
	
	//显示菜单
	 public int showMainMenu(){
		System.out.println("================欢迎使用水果库存系统==================");
		System.out.println("1.显示水果信息");
		System.out.println("2.添加水果");
		System.out.println("3.水果下架");
		System.out.println("4.退出");
		System.out.println("=================================================");
		System.out.print("请选择：");
		 
		int slt=input.nextInt();
		return slt;
	 }
		
		//退出
		boolean exit(){
			System.out.println("是否要退出？(Y/N)：");
			String slt=input.next();
			return !"Y".equalsIgnoreCase(slt);
		}
	}


