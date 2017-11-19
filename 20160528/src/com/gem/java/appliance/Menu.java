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
	private Cart cart=new Cart();//默认情况下准备一个购物车

//显示菜单
	 public int showMainMenu(){
		System.out.println("================家电库存系统==================");
		System.out.println("1.添加入库家电资料");
		System.out.println("2.浏览入库家电资料");
		System.out.println("3.按家电类型查询");
		System.out.println("4.修改入库家电资料");
		System.out.println("5.删除入库家电资料");
		System.out.println("6.加入购物车");
		System.out.println("7.结账");
		System.out.println("0.退出");
		System.out.println("=================================================");
		System.out.print("请选择：");
		 
		int slt=input.nextInt();
		return slt;
	 }
	 
	 
	 //显示表头
	 public void showTitle(){
		 System.out.println("-------------------------------------------------");
		 System.out.println("类型\t名称\t价格\t数量\t\t入库日期");
	 }
	 
	 //显示表尾
	 public void showTitleEnd(){
		 System.out.println("-------------------------------------------------");
	 }
	 
	 //数据初始化
	 public Menu(){
		loadData(DATA_FILE);
		readCart();
	 }
	//读出数据
		private void loadData(String filePath){
			File file=new File(filePath);//通过文件地址获取文件
			if(file.exists()&&file.isFile()){
				try{
					BufferedReader reader =new BufferedReader(new FileReader(file));
					String ApplianceStr=null;//默认家电信息字符串为空
					while((ApplianceStr=reader.readLine())!=null){//获取家电信息字符串
						String[]StrArr=ApplianceStr.split("_");//以家电信息字符串中的下划线分割符为单位，将字符串分割成5个字符串，然后存入数组
						String type=StrArr[0];//第一个字符串代表家电类型
						String name=StrArr[1];
						int price=Integer.parseInt(StrArr[2]);//将第三个字符串转换为整型输出
						int count=Integer.parseInt(StrArr[3]);
						String date=StrArr[4];
						Appliance appliance=new Appliance(type,name,price,count,date);
						ApplianceSet.add(appliance);//将文件中家电的信息读出后 存入家电集合
					}
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	
	 //通过类型和名称找到该家电
	 public Appliance getApplianceByTypeAndName(String type,String name){
		 for(Appliance appliances :ApplianceSet){
			 if(type.equals(appliances.getType())&&name.equals(appliances.getName())){
				 return appliances;
			 }	
		 }
		return null;
	 }
	 
	 //添加入库家电资料
	 public void addAppliance(){
		 System.out.print("请输入家电类型:");
		 String type=input.next();
		 System.out.print("请输入家电名称:");
		 String name=input.next();
		 Appliance appliance=getApplianceByTypeAndName(type, name);
		 
		 if(appliance==null){
			 System.out.print("请输入价格:");
			 int price=input.nextInt();
			 System.out.print("请输入数量:");
			 int count=input.nextInt();
			 System.out.print("请输入入库日期:");
			String date=input.next();
			 Appliance newappliance=new Appliance(type,name,price,count,date);
			 ApplianceSet.add(newappliance);
		 }else{
		System.out.println("请输入新增的数量:");
		int appCount = input.nextInt() ;
		appliance.setCount(appliance.getCount() + appCount );
		 }	 
		 System.out.println("添加成功！");
	 }
	 
	 //浏览入库家电资料
	 public void showAppliance(){
		 showTitle();
		 if(ApplianceSet==null||ApplianceSet.size()<=0){
			 System.out.println("对不起没有库存信息！");
		 }else{
			 Iterator<Appliance> applianceItor=ApplianceSet.iterator();
		 while(applianceItor.hasNext()){
			 Appliance appliance=applianceItor.next();
			System.out.println(appliance); 
		 }
		 }
		 
		 showTitleEnd();
	 }
	 //按家电类型查询
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
			System.out.print("请输入类型:");
			String type=input.next();
			Set<Appliance> appliances = getApplianceByType(type) ;
			for(Appliance appliance : appliances){
				System.out.println(appliance);
			}
			showTitleEnd();
		}

		 
	 
	//修改入库家电资料
	 public void modify(){
		 System.out.print("请输入家电类型:");
		 String type=input.next();
		 System.out.print("请输入家电名称:");
		 String name=input.next();
		 Appliance appliance=getApplianceByTypeAndName(type, name);
		 
		 if(appliance==null){
			 System.out.println("对不起，没有该家电信息!");
		 }else{
			 System.out.print("请输入新的价格:");
			 int price=input.nextInt();
			 System.out.print("请输入新增数量:");
			 int count=input.nextInt();
			 
			 appliance.setPrice(price);
			 appliance.setCount(appliance.getCount()+count);
		 }
	 }
	 
	 
	 //删除入库家电资料
	 public void delAppliance(){
		 boolean flag=true;
		 do{
		 System.out.print("请输入家电类型:");
		 String type=input.next();
		 System.out.print("请输入家电名称:");
		 String name=input.next();
		 Appliance appliance=getApplianceByTypeAndName(type, name);
		 if(appliance==null){
			 System.out.println("没有该电器信息!");
		 } else{
			  System.out.println("是否要删除?(Y/N):");
			  String slt=input.next();
			  if("Y".equalsIgnoreCase(slt)){
			  ApplianceSet.remove(appliance) ;
					flag=false;
			 }	
		 }
		 }while(flag);
		  System.out.println("删除成功");		
		 }
	
	//退出	 
	public boolean exits(){
		System.out.print("是否要离开?(Y/N):");
		String slt=input.next();
		if("Y".equalsIgnoreCase(slt)){
			saveDataToFile();
			saveCart();//退出之前保存信息到文件并且保存购物车信息
			return false;
		}else{
			return true;
		}
		
	}	
	 
	//加入购物车
	public void shopping(){
		System.out.print("请输入购买电器类型:");
		String type=input.next();
		System.out.print("请输入购买电器名称:");
		String name=input.next();
		Appliance appliance=getApplianceByTypeAndName(type, name);
		if(appliance==null){
			System.out.println("对不起，您要购买的电器不存在！");
			}else{
				System.out.println(appliance);
				System.out.println();
				int buycount=0;
				do{
				System.out.print("请输入要购买的数量:");
				 buycount=input.nextInt();
				if(buycount>appliance.getCount()){
					System.out.println("对不起，购买数量超过限制！");
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
		System.out.println("添加至购物车成功！");	
	}
	//还原购物车信息
	private void readCart(){
		File file =new File("src/Cart.db");//通过路径获取Cart.db这个文件
		if(file.exists()&&file.isFile()){
			ObjectInputStream ois=null;//默认对象（购物车）输入流为空
			try{
			    ois=new ObjectInputStream(new FileInputStream(file));//将文件放入对象输入流
				this.cart=(Cart)ois.readObject();//读出流中的信息，并存放到实例化的购物车中去
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally{
				if(ois!=null){//读完后如果流不为空
					try{						
						ois.close();//关闭流
						file.delete();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	//保存购物车信息
	private void saveCart(){
		if(cart!=null&&cart.getCartitemMap()!=null&&cart.getCartitemMap().size()>0){
			ObjectOutputStream oos=null;
			try{
				oos=new ObjectOutputStream(new FileOutputStream("src/cart.db"));
				oos.writeObject(cart);//将购物车信息写入cart.db
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
	//更新库存信息并保存
	private void saveData(){
		Map<String,Cartitem>cartitemMap=cart.getCartitemMap();
		Set<String>cartitemMapkeys=cartitemMap.keySet();
		Iterator<String>keys=cartitemMapkeys.iterator();
		while(keys.hasNext()){
			String Key=keys.next();
			Cartitem cartitem=cartitemMap.get(Key);
			Appliance appliance=cartitem.getAppliance();
			int buycount=cartitem.getBuycount();		
			for(Appliance appliances:ApplianceSet){//通过增强的for循环，获取家电集合中的家电信息
				if(appliances.getName().equals(appliance.getName())&&appliances.getType().equals(appliance.getType())){
					appliances.setCount(appliances.getCount()-buycount);
				}
			}
		}//如果家电集合中找到了和购物车集合中相同类型和名称的家电，则将新的库存信息录入到家电集中
		saveDataToFile();
	}
	//将录入的信息保存到文件
	private void saveDataToFile(){
		PrintWriter pw=null;//打印流默认为空
		try{
			pw=new PrintWriter(new BufferedWriter(new FileWriter(DATA_FILE)));//将存放家电信息的文件路径作为目标文件
			Iterator<Appliance> itor=ApplianceSet.iterator();//通过迭代获取家电集合中的信息
			while(itor.hasNext()){
				Appliance appliance=itor.next();
				String applianceStr=appliance.getType()+"_"+appliance.getName()+"_"+appliance.getPrice()+"_"+appliance.getCount()+"_"+appliance.getDate();
				pw.println(applianceStr);//将家电信息以"类型_名称_价格_数量_日期"的形式写入文件
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
	
	
	//结账
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
		System.out.println("总计:"+sum);
		System.out.print("是否结账?(Y/N):");
		String slt=input.next();
		if("Y".equalsIgnoreCase(slt)){
			System.out.println("结账成功");
			saveData();//在清空购物车集合之前保存更新后的库存信息
			cart.getCartitemMap().clear();
		}
		
		}
			
	}