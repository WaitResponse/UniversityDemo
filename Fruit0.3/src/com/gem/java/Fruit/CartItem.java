package com.gem.java.Fruit;

public class CartItem {
	private Fruit fruit;
	private int buyCount;//购物袋有fruit和购买数量两个属性
	
	public CartItem(){}

	public CartItem(Fruit fruit, int buyCount) {
		super();
		this.fruit = fruit;
		this.buyCount = buyCount;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public int getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}


}
