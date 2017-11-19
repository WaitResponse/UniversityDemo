package com.gem.java.oop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo10 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
			
		map.put("a01","����");
		map.put("a02","�ֿ�˹");
		map.put("a03","�׿˶�");
		
		
		System.out.println(map.size());
		
		Set<String>keys=map.keySet();
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()){
			String k = ite.next();
			String v = map.get(k);
			System.out.println(k +" -> " + v);
		}
		}
	}

