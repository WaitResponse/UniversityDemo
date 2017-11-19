package com.gem.java.fruit;

import java.util.Scanner;

public class Menu {
	private Scanner input=new Scanner(System.in);
	private Fruit []fruits=new Fruit[20];
	private int size=0;//��¼ˮ��������
	
	//��ʼ������
	public void initData(){
		Fruit f01=new Fruit("ƻ��",5,100,"�츻ʿ���ܸܵģ�");
		Fruit f02=new Fruit("����",12,224,"̨����棬�ܸܵģ�");
		Fruit f03=new Fruit("����",12,363,"ɳ�����ϣ��ܸܵģ�");
		
		fruits[0]=f01;
		fruits[1]=f02;
		fruits[2]=f03;	
		
		size=3;
	}
	public Menu(){
		initData();
	}
	
	//��ʾˮ���б�
	public void showFruits(){
		System.out.println("================ˮ���б�=================");
		showTitle();
		for(int i=0;i<size;i++){
			Fruit fruit=fruits[i];
			fruit.showInfo();
		}
	}
	//��ʾ��ͷ��Ϣ
	private void showTitle(){
		System.out.println("����\t����(Ԫ)\t�����(kg)\t����");
	}
	
	
	//��ʾ�˵�
	public int showMainMenu(){
		System.out.println("1.**********��ӭʹ��ˮ��������ϵͳ**********");
		System.out.println("1.չʾˮ���б�");
		System.out.println("2.�����ˮ��");
		System.out.println("3.���յ�������չʾˮ����Ϣ");
		System.out.println("4.���տ��������չʾˮ����Ϣ");
		System.out.println("5.��ѯ�ض�ˮ��");
		System.out.println("6.�˳�");
		System.out.print("��ѡ��:");
		 return input.nextInt();
	}
	
	//ѯ���Ƿ����
	public boolean askContinue(){
		System.out.println("�������������������N�˳���");
		return !"N".equalsIgnoreCase(input.next())?true:false;
	}
	
	// ��ʾ�ض�ˮ����Ϣ
	public void showFruit (){
		System.out.print("������ˮ�����ƣ�");	
		String fname=input.next();
		showTitle();
		Fruit fruit=getFruitByFname(fname);
		if(fruit!=null){
			fruit.showInfo();
		}
		else{
			System.out.println("�Բ���û���ҵ��йؼ�¼��");
		}
	}
	
	
	//��ѯ�ض�ˮ����Ϣ
		private Fruit getFruitByFname(String fname){
		for(int i=0;i<size;i++){
			Fruit fruit=fruits[i];
			if(fruit.getFname().equals(fname)){
				//��ӡˮ����Ϣ
			return fruit;
			}
		}
		return null;		
	}
	//���ˮ��
	public void addFruit(){
		System.out.print("������ˮ�����ƣ�");
		String fname=input.next();
		Fruit fruit=getFruitByFname(fname);
		
		if(fruit!=null){
			System.out.print("�����������Ŀ������");
			int count=input.nextInt();
			fruit.setCount(fruit.getCount()+count);			
		}else{
			System.out.print("�����뵥�ۣ�");
			double price=input.nextDouble();
			
			System.out.print("������������");
			int count=input.nextInt();
			
			System.out.print("�������������");
			String detail=input.next();
						
			fruit=new Fruit(fname, price,count, detail);
			fruits[size++]=fruit;
		}	
		System.out.println("���ɹ���");
	}

		// ���յ�������չʾˮ����Ϣ
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
		
		//���տ����չʾˮ����Ϣ
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
		
		//�˳�
		public boolean exit(){

			System.out.println("�Ƿ�Ҫ�˳�?(Y/N)");
			return !"Y".equalsIgnoreCase(input.next());
		}
		
}

		
	

