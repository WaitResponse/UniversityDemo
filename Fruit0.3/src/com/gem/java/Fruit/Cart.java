package com.gem.java.Fruit;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private Map<String,CartItem> cartItemMap=new HashMap<String,CartItem>();//ʵ������һ��HashMap��Ķ��󣬼������(�������Map����)
	//String�������key��CartItem�������
	public Cart(){}
	
	public Map<String, CartItem> getCartItemMap() {
		return cartItemMap;
	}


	public void setCartItemMap(Map<String, CartItem> cartItem) {
		this.cartItemMap = cartItem;
	}
	
}
/*���ﳵ������������
1.Ĭ�Ϲ��췽��
2.��ȡ������������������װ��Fruit�͹�������
3.�½������������ڲ��ҹ��ﳵ��Ĺ����û���ҵ��ǣ����ø÷���
*
*
*
*/

