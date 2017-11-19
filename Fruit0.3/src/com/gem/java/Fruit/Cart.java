package com.gem.java.Fruit;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private Map<String,CartItem> cartItemMap=new HashMap<String,CartItem>();//实例化了一个HashMap类的对象，即购物袋(购物袋是Map类型)
	//String购物袋的key，CartItem代表购物袋
	public Cart(){}
	
	public Map<String, CartItem> getCartItemMap() {
		return cartItemMap;
	}


	public void setCartItemMap(Map<String, CartItem> cartItem) {
		this.cartItemMap = cartItem;
	}
	
}
/*购物车有三个方法：
1.默认构造方法
2.获取购物袋：包括购物袋里装的Fruit和购买数量
3.新建购物袋：如果在查找购物车里的购物袋没有找到是，调用该方法
*
*
*
*/

