package com.gem.java.Fruit;

import java.util.Scanner;

public class Menu {
	Fruit []fruits= new Fruit[3];
	Scanner input=new Scanner(System.in);
	int size=0;
	
	//��ʼ��ˮ����Ϣ
	{
		Fruit f01=new Fruit("ƻ��",5,150,"�츻ʿ������");
		Fruit f02=new Fruit("����",12,80,"���ʣ����ᣡ");
			
		fruits[0]=f01;
		fruits[1]=f02;
		
		size=2;
	}
	
	//��ʾˮ����Ϣ
	void showFruit(){
		System.out.println("-----------------------------------------");
		System.out.println("����\t����\t�����\t��ע");
		if(size<=0){
			System.out.println("�Բ��𣬿������û���κμ�¼��");
		}else{
			for(int i = 0 ; i<size ; i++){
				Fruit fruit = fruits[i];
			System.out.println(fruit);
			}
		}
		
		System.out.println("-----------------------------------------");
	}
	
	
	//���ˮ��
	void addFruit(){
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
			fruits[size++]=fruit;
			resizeArray();//��������������������
			
		}else{
			System.out.print("������׷�ӵĿ����:");
			int count = input.nextInt() ;
			Fruit currFruit = fruits[index] ;
			currFruit.setCount(currFruit.getCount() + count);
		}
		System.out.println("��ӳɹ�");
	}
	
	
	//�����Ƿ��и�ˮ��
	int getFruit(String name){
		for(int i = 0 ; i<size ; i++){
			Fruit currFruit = fruits[i] ;
			if(name.equals(currFruit.getName())){
				return i ;
			}
		}
		return -1 ;
	}
	
	//ˮ���¼�
	void delFruit(){
		System.out.print("�������¼ܵ�ˮ�����ƣ�");
		String name = input.next() ;
		int index = getFruit(name);
		if(index==-1){
			System.out.println("�Բ���ָ����ˮ�������ڣ�");
		}else{
			System.out.print("�Ƿ�ȷ���¼ܣ�(Y/N)");
			String slt = input.next() ;
			if("Y".equalsIgnoreCase(slt)){			
				for(int i = index ; i<size-1 ; i++){	
					fruits[i] = fruits[i+1];
				}
				fruits[size-1]=null ;
				System.out.println("�¼ܳɹ���");
				size--;
			}
		}
	}
	
	
	//��������
	void resizeArray(){
		if(size>=fruits.length){
			//1.׼��һ�����������
			Fruit[] fruits2 = new Fruit[size*2];
			//2.��ԭʼ�����е�Ԫ��ȫ�����Ƶ��µ�������
			for(int i = 0 ; i < size ; i++){
				fruits2[i] = fruits[i];
			}
			//3.��fruitArr������ñ���ָ���µ�����λ��
			fruits = fruits2 ;
		}
	}
	
	
	//��ʾ�˵�
	 public int showMainMenu(){
		System.out.println("================��ӭʹ��ˮ�����ϵͳ==================");
		System.out.println("1.��ʾˮ����Ϣ");
		System.out.println("2.���ˮ��");
		System.out.println("3.ˮ���¼�");
		System.out.println("4.�˳�");
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


