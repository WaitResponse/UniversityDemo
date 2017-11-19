package com.gem.java.Fruit;

import java.util.Comparator;

public class CountAsc implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
	if(o1.getCount()<o2.getCount()){
		return 1;
	}else{
		return -1;
	}
	
}}
