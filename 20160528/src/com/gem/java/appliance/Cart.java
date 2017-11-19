package com.gem.java.appliance;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable {

	 Map<String,Cartitem>CartitemMap=new HashMap<String,Cartitem>();
	 
	 
	 public Cart(){}


	public Cart(Map<String, Cartitem> cartitemMap) {
		super();
		CartitemMap = cartitemMap;
	}


	public   Map<String, Cartitem> getCartitemMap() {
		return CartitemMap;
	}


	public void setCartitemMap(Map<String, Cartitem> cartitemMap) {
		CartitemMap = cartitemMap;
	}
	 
	 
	 
}
