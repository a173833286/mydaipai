package com.ucclub.aspect.ch03;

public class SmartSeller implements Seller {

	@Override
	public int sell(String goodsName,String sellName) {


		System.out.println(sellName+"---Sell:"+goodsName);
		return 1;

	}

	protected int showGoods(String goodsName){
		System.out.println("this goods names "+goodsName);
		return 1;
	} 
}
