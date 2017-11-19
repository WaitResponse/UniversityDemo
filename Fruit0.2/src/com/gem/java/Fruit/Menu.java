package com.gem.java.Fruit;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private List<Fruit> fruitslist=new ArrayList<Fruit>();
	Scanner input=new Scanner(System.in);
	
	
	//初始化水果信息
	public void Initdata()
	{
		Fruit f01=new Fruit("苹果",10,75,"红富士，很甜");			
		Fruit f02=new Fruit("柠檬",12,80,"柠檬，很酸！");
		
		fruitslist.add(f01);
		fruitslist.add(f02);			
	
	}
	public Menu(){
		Initdata();
	}
	
	//显示水果信息
	public void showFruit(){
		System.out.println("-----------------------------------------");
		System.out.println("名称\t单价\t库存量\t备注");
			for(int i = 0 ; i<fruitslist.size() ; i++){
				if(fruitslist.get(i)==null){
					System.out.println("对不起，没有库存记录");
				}else{	
					System.out.println(fruitslist.get(i));
				}
			}			
			System.out.println("-----------------------------------------");
			}
			
	
	
	//添加水果
	public void addFruit(){
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
			fruitslist.add(fruit);
			
		}else{
			System.out.print("请输入追加的库存量:");
			int count = input.nextInt() ;
			Fruit currFruit = fruitslist.get(index);
			currFruit.setCount(currFruit.getCount() + count);
		}
		System.out.println("添加成功");
	}
	
	
	//查找是否有该水果
	private int getFruit(String name){
		for(int i = 0 ; i<fruitslist.size();i++){
			Fruit currFruit =fruitslist.get(i);
			if(name.equals(currFruit.getName())){
				return i ;
			}
		}
		return -1 ;
	}
	
	//水果下架
	public void delFruit(){
		System.out.print("请输入下架的水果名称：");
		String name = input.next() ;
		int index = getFruit(name);
		if(index==-1){
			System.out.println("对不起，指定的水果不存在！");
		}else{
			System.out.print("是否确认下架？(Y/N)");
			String slt=input.next();
			if("Y".equalsIgnoreCase(slt)){				
				fruitslist.remove(index);
				System.out.println("下架成功！");
			}
		}
	}
	
//按照库存降序显示水果信息
	public void showFruitByCountAsc(){
		Collections.sort(fruitslist,new CountAsc());
		showFruit();
	}
	
	
	//显示菜单
	 public int showMainMenu(){
		System.out.println("================欢迎使用水果库存系统==================");
		System.out.println("1.显示水果信息");
		System.out.println("2.添加水果");
		System.out.println("3.水果下架");
		System.out.println("4.按照库存降序显示水果信息");
		System.out.println("5.退出");
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


