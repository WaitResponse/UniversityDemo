package com.gem.java.appliance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

	public class Menu {
	private static final String DATA_FILE="src/Appliance.db";
	private static final String CART_FILE="src/Cart.db";
	private Set<Appliance> ApplianceSet=new HashSet<Appliance>();
	Scanner input=new Scanner(System.in);
	private Cart cart=new Cart();//Ĭ�������׼��һ�����ﳵ

//��ʾ�˵�
	 public int showMainMenu(){
		System.out.println("================�ҵ���ϵͳ==================");
		System.out.println("1.������ҵ�����");
		System.out.println("2.������ҵ�����");
		System.out.println("3.���ҵ����Ͳ�ѯ");
		System.out.println("4.�޸����ҵ�����");
		System.out.println("5.ɾ�����ҵ�����");
		System.out.println("6.���빺�ﳵ");
		System.out.println("7.����");
		System.out.println("0.�˳�");
		System.out.println("=================================================");
		System.out.print("��ѡ��");
		 
		int slt=input.nextInt();
		return slt;
	 }
	 
	 
	 //��ʾ��ͷ
	 public void showTitle(){
		 System.out.println("-------------------------------------------------");
		 System.out.println("����\t����\t�۸�\t����\t\t�������");
	 }
	 
	 //��ʾ��β
	 public void showTitleEnd(){
		 System.out.println("-------------------------------------------------");
	 }
	 
	 //���ݳ�ʼ��
	 public Menu(){
		loadData(DATA_FILE);
		readCart();
	 }
	//��������
		private void loadData(String filePath){
			File file=new File(filePath);//ͨ���ļ���ַ��ȡ�ļ�
			if(file.exists()&&file.isFile()){
				try{
					BufferedReader reader =new BufferedReader(new FileReader(file));
					String ApplianceStr=null;//Ĭ�ϼҵ���Ϣ�ַ���Ϊ��
					while((ApplianceStr=reader.readLine())!=null){//��ȡ�ҵ���Ϣ�ַ���
						String[]StrArr=ApplianceStr.split("_");//�Լҵ���Ϣ�ַ����е��»��߷ָ��Ϊ��λ�����ַ����ָ��5���ַ�����Ȼ���������
						String type=StrArr[0];//��һ���ַ�������ҵ�����
						String name=StrArr[1];
						int price=Integer.parseInt(StrArr[2]);//���������ַ���ת��Ϊ�������
						int count=Integer.parseInt(StrArr[3]);
						String date=StrArr[4];
						Appliance appliance=new Appliance(type,name,price,count,date);
						ApplianceSet.add(appliance);//���ļ��мҵ����Ϣ������ ����ҵ缯��
					}
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	
	 //ͨ�����ͺ������ҵ��üҵ�
	 public Appliance getApplianceByTypeAndName(String type,String name){
		 for(Appliance appliances :ApplianceSet){
			 if(type.equals(appliances.getType())&&name.equals(appliances.getName())){
				 return appliances;
			 }	
		 }
		return null;
	 }
	 
	 //������ҵ�����
	 public void addAppliance(){
		 System.out.print("������ҵ�����:");
		 String type=input.next();
		 System.out.print("������ҵ�����:");
		 String name=input.next();
		 Appliance appliance=getApplianceByTypeAndName(type, name);
		 
		 if(appliance==null){
			 System.out.print("������۸�:");
			 int price=input.nextInt();
			 System.out.print("����������:");
			 int count=input.nextInt();
			 System.out.print("�������������:");
			String date=input.next();
			 Appliance newappliance=new Appliance(type,name,price,count,date);
			 ApplianceSet.add(newappliance);
		 }else{
		System.out.println("����������������:");
		int appCount = input.nextInt() ;
		appliance.setCount(appliance.getCount() + appCount );
		 }	 
		 System.out.println("��ӳɹ���");
	 }
	 
	 //������ҵ�����
	 public void showAppliance(){
		 showTitle();
		 if(ApplianceSet==null||ApplianceSet.size()<=0){
			 System.out.println("�Բ���û�п����Ϣ��");
		 }else{
			 Iterator<Appliance> applianceItor=ApplianceSet.iterator();
		 while(applianceItor.hasNext()){
			 Appliance appliance=applianceItor.next();
			System.out.println(appliance); 
		 }
		 }
		 
		 showTitleEnd();
	 }
	 //���ҵ����Ͳ�ѯ
	 private Set<Appliance> getApplianceByType(String type){
			Set<Appliance> appliances = new HashSet<Appliance>();
			for(Appliance appliance : ApplianceSet){
				if(appliance.getType().equals(type)){
					appliances.add(appliance);
				}
			}
			return appliances;
		}
		
		public void showApplianceByType(){
			showTitle();
			System.out.print("����������:");
			String type=input.next();
			Set<Appliance> appliances = getApplianceByType(type) ;
			for(Appliance appliance : appliances){
				System.out.println(appliance);
			}
			showTitleEnd();
		}

		 
	 
	//�޸����ҵ�����
	 public void modify(){
		 System.out.print("������ҵ�����:");
		 String type=input.next();
		 System.out.print("������ҵ�����:");
		 String name=input.next();
		 Appliance appliance=getApplianceByTypeAndName(type, name);
		 
		 if(appliance==null){
			 System.out.println("�Բ���û�иüҵ���Ϣ!");
		 }else{
			 System.out.print("�������µļ۸�:");
			 int price=input.nextInt();
			 System.out.print("��������������:");
			 int count=input.nextInt();
			 
			 appliance.setPrice(price);
			 appliance.setCount(appliance.getCount()+count);
		 }
	 }
	 
	 
	 //ɾ�����ҵ�����
	 public void delAppliance(){
		 boolean flag=true;
		 do{
		 System.out.print("������ҵ�����:");
		 String type=input.next();
		 System.out.print("������ҵ�����:");
		 String name=input.next();
		 Appliance appliance=getApplianceByTypeAndName(type, name);
		 if(appliance==null){
			 System.out.println("û�иõ�����Ϣ!");
		 } else{
			  System.out.println("�Ƿ�Ҫɾ��?(Y/N):");
			  String slt=input.next();
			  if("Y".equalsIgnoreCase(slt)){
			  ApplianceSet.remove(appliance) ;
					flag=false;
			 }	
		 }
		 }while(flag);
		  System.out.println("ɾ���ɹ�");		
		 }
	
	//�˳�	 
	public boolean exits(){
		System.out.print("�Ƿ�Ҫ�뿪?(Y/N):");
		String slt=input.next();
		if("Y".equalsIgnoreCase(slt)){
			saveDataToFile();
			saveCart();//�˳�֮ǰ������Ϣ���ļ����ұ��湺�ﳵ��Ϣ
			return false;
		}else{
			return true;
		}
		
	}	
	 
	//���빺�ﳵ
	public void shopping(){
		System.out.print("�����빺���������:");
		String type=input.next();
		System.out.print("�����빺���������:");
		String name=input.next();
		Appliance appliance=getApplianceByTypeAndName(type, name);
		if(appliance==null){
			System.out.println("�Բ�����Ҫ����ĵ��������ڣ�");
			}else{
				System.out.println(appliance);
				System.out.println();
				int buycount=0;
				do{
				System.out.print("������Ҫ���������:");
				 buycount=input.nextInt();
				if(buycount>appliance.getCount()){
					System.out.println("�Բ��𣬹��������������ƣ�");
				}else{
					break;
				}
				}while(true);
				
				Map<String,Cartitem>cartitemMap=cart.getCartitemMap();
				if(cartitemMap.containsKey(type)){
					Cartitem cartitem=cartitemMap.get(type);
					cartitem.setBuycount(buycount+cartitem.getBuycount());
				}else{
					Cartitem cartitem=new Cartitem(appliance,buycount);
					cartitemMap.put(type, cartitem);
				}		
	}
		System.out.println("��������ﳵ�ɹ���");	
	}
	//��ԭ���ﳵ��Ϣ
	private void readCart(){
		File file =new File("src/Cart.db");//ͨ��·����ȡCart.db����ļ�
		if(file.exists()&&file.isFile()){
			ObjectInputStream ois=null;//Ĭ�϶��󣨹��ﳵ��������Ϊ��
			try{
			    ois=new ObjectInputStream(new FileInputStream(file));//���ļ��������������
				this.cart=(Cart)ois.readObject();//�������е���Ϣ������ŵ�ʵ�����Ĺ��ﳵ��ȥ
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally{
				if(ois!=null){//������������Ϊ��
					try{						
						ois.close();//�ر���
						file.delete();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	//���湺�ﳵ��Ϣ
	private void saveCart(){
		if(cart!=null&&cart.getCartitemMap()!=null&&cart.getCartitemMap().size()>0){
			ObjectOutputStream oos=null;
			try{
				oos=new ObjectOutputStream(new FileOutputStream("src/cart.db"));
				oos.writeObject(cart);//�����ﳵ��Ϣд��cart.db
				oos.flush();
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(oos!=null){
					try{
						oos.close();						
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	//���¿����Ϣ������
	private void saveData(){
		Map<String,Cartitem>cartitemMap=cart.getCartitemMap();
		Set<String>cartitemMapkeys=cartitemMap.keySet();
		Iterator<String>keys=cartitemMapkeys.iterator();
		while(keys.hasNext()){
			String Key=keys.next();
			Cartitem cartitem=cartitemMap.get(Key);
			Appliance appliance=cartitem.getAppliance();
			int buycount=cartitem.getBuycount();		
			for(Appliance appliances:ApplianceSet){//ͨ����ǿ��forѭ������ȡ�ҵ缯���еļҵ���Ϣ
				if(appliances.getName().equals(appliance.getName())&&appliances.getType().equals(appliance.getType())){
					appliances.setCount(appliances.getCount()-buycount);
				}
			}
		}//����ҵ缯�����ҵ��˺͹��ﳵ��������ͬ���ͺ����Ƶļҵ磬���µĿ����Ϣ¼�뵽�ҵ缯��
		saveDataToFile();
	}
	//��¼�����Ϣ���浽�ļ�
	private void saveDataToFile(){
		PrintWriter pw=null;//��ӡ��Ĭ��Ϊ��
		try{
			pw=new PrintWriter(new BufferedWriter(new FileWriter(DATA_FILE)));//����żҵ���Ϣ���ļ�·����ΪĿ���ļ�
			Iterator<Appliance> itor=ApplianceSet.iterator();//ͨ��������ȡ�ҵ缯���е���Ϣ
			while(itor.hasNext()){
				Appliance appliance=itor.next();
				String applianceStr=appliance.getType()+"_"+appliance.getName()+"_"+appliance.getPrice()+"_"+appliance.getCount()+"_"+appliance.getDate();
				pw.println(applianceStr);//���ҵ���Ϣ��"����_����_�۸�_����_����"����ʽд���ļ�
			}
			pw.flush();		
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
		
	}
	
	
	//����
	public void pay(){
		Map<String,Cartitem>cartitemMap=cart.getCartitemMap();
		Set<String> cartitemMapkeys=cartitemMap.keySet();
		Iterator<String>keys=cartitemMapkeys.iterator();
		int sum=0;
		while(keys.hasNext()){
			String key=keys.next();
			Cartitem cartitem=cartitemMap.get(key);
			Appliance appliance=cartitem.getAppliance();
			int buycount=cartitem.getBuycount();		
			int xj=buycount*appliance.getPrice();
			sum=sum+xj;
			System.out.println(key+"\t"+appliance.getName()+"\t"+appliance.getPrice()+"\t"+buycount+"\t"+xj);
		 }
		System.out.println("�ܼ�:"+sum);
		System.out.print("�Ƿ����?(Y/N):");
		String slt=input.next();
		if("Y".equalsIgnoreCase(slt)){
			System.out.println("���˳ɹ�");
			saveData();//����չ��ﳵ����֮ǰ������º�Ŀ����Ϣ
			cart.getCartitemMap().clear();
		}
		
		}
			
	}