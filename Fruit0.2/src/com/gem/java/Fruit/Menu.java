package com.gem.java.Fruit;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private List<Fruit> fruitslist=new ArrayList<Fruit>();
	Scanner input=new Scanner(System.in);
	
	
	//��ʼ��ˮ����Ϣ
	public void Initdata()
	{
		Fruit f01=new Fruit("ƻ��",10,75,"�츻ʿ������");			
		Fruit f02=new Fruit("����",12,80,"���ʣ����ᣡ");
		
		fruitslist.add(f01);
		fruitslist.add(f02);			
	
	}
	public Menu(){
		Initdata();
	}
	
	//��ʾˮ����Ϣ
	public void showFruit(){
		System.out.println("-----------------------------------------");
		System.out.println("����\t����\t�����\t��ע");
			for(int i = 0 ; i<fruitslist.size() ; i++){
				if(fruitslist.get(i)==null){
					System.out.println("�Բ���û�п���¼");
				}else{	
					System.out.println(fruitslist.get(i));
				}
			}			
			System.out.println("-----------------------------------------");
			}
			
	
	
	//���ˮ��
	public void addFruit(){
		System.out.print("���������ƣ�");
		String name=input.next();
		int index=getFruit(name);
		if(index==-1){
			System.out.print("�����뵥�ۣ�");
			int price=input.nextInt();
			System.out.print("������������");
			int count=input.nextInt();
			System.out.print("������������");
			String detail=input.next();
					
			Fruit fruit=new Fruit(name,price,count,detail);	
			fruitslist.add(fruit);
			
		}else{
			System.out.print("������׷�ӵĿ����:");
			int count = input.nextInt() ;
			Fruit currFruit = fruitslist.get(index);
			currFruit.setCount(currFruit.getCount() + count);
		}
		System.out.println("��ӳɹ�");
	}
	
	
	//�����Ƿ��и�ˮ��
	private int getFruit(String name){
		for(int i = 0 ; i<fruitslist.size();i++){
			Fruit currFruit =fruitslist.get(i);
			if(name.equals(currFruit.getName())){
				return i ;
			}
		}
		return -1 ;
	}
	
	//ˮ���¼�
	public void delFruit(){
		System.out.print("�������¼ܵ�ˮ�����ƣ�");
		String name = input.next() ;
		int index = getFruit(name);
		if(index==-1){
			System.out.println("�Բ���ָ����ˮ�������ڣ�");
		}else{
			System.out.print("�Ƿ�ȷ���¼ܣ�(Y/N)");
			String slt=input.next();
			if("Y".equalsIgnoreCase(slt)){				
				fruitslist.remove(index);
				System.out.println("�¼ܳɹ���");
			}
		}
	}
	
//���տ�潵����ʾˮ����Ϣ
	public void showFruitByCountAsc(){
		Collections.sort(fruitslist,new CountAsc());
		showFruit();
	}
	
	
	//��ʾ�˵�
	 public int showMainMenu(){
		System.out.println("================��ӭʹ��ˮ�����ϵͳ==================");
		System.out.println("1.��ʾˮ����Ϣ");
		System.out.println("2.���ˮ��");
		System.out.println("3.ˮ���¼�");
		System.out.println("4.���տ�潵����ʾˮ����Ϣ");
		System.out.println("5.�˳�");
		System.out.println("=================================================");
		System.out.print("��ѡ��");
		 
		int slt=input.nextInt();
		return slt;
	 }
		
		//�˳�
		boolean exit(){
			System.out.println("�Ƿ�Ҫ�˳���(Y/N)��");
			String slt=input.next();
			return !"Y".equalsIgnoreCase(slt);
		}
	}


