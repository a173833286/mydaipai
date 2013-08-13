package com.ucclub.aspect.ch02;


public class NaiveWaiter implements Waiter {

	@Override

	public void greetTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NaviWaiter:greet to "+clientName+"...");
		
	}
	@Override
	public void serveTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NaviWaiter:serving"+clientName+"...");
		
	}
	
	public void smile(String clientName,int times){
		System.out.println(clientName+" smile "+times+" s");
		
	}
}
