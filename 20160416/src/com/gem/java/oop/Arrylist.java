package com.gem.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Arrylist {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//����һ����̬���� //����
		
		list.add("����");	
		list.add("18");
		list.add("����");
		list.add("��");//�����������Ԫ��
		
		list.remove(0);
		System.out.println("ʵ�ʴ��Ԫ�صĸ���"+list.size());
		
	/*	Object object =list.get(0);
		String name=(String)object;
		System.out.println(name);*/
		
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(str+"\t");
		}
		
		
	/*	System.out.println("ɾ��֮��...");
		for(int i=0;i<list.size();i++){
			Object obj=list.get(i);
			System.out.println(obj+"\t");
		}*/
		list.toArray();
		
	}
}
