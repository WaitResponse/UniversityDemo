package com.gem.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Arrylist {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//创建一个动态数组 //泛型
		
		list.add("张三");	
		list.add("18");
		list.add("苏州");
		list.add("男");//往数组里添加元素
		
		list.remove(0);
		System.out.println("实际存放元素的个数"+list.size());
		
	/*	Object object =list.get(0);
		String name=(String)object;
		System.out.println(name);*/
		
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(str+"\t");
		}
		
		
	/*	System.out.println("删除之后...");
		for(int i=0;i<list.size();i++){
			Object obj=list.get(i);
			System.out.println(obj+"\t");
		}*/
		list.toArray();
		
	}
}
