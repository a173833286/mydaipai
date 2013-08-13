package com.ucclub.aspect.ch04;

import com.ucclub.aspect.ch01.NeedTest;
import com.ucclub.aspect.ch02.Waiter;

public class NaughtyWaiter implements Waiter {

	@Override
	@NeedTest
	public void greetTo(String clientName) {
		// TODO Auto-generated method stub
     System.out.println("NaughtyWaiter-"+clientName+" greetTo ...");
	}

	@Override
	public void serveTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NaughtyWaiter-"+clientName+" server...");
		

	}
	
	public void joke(String clientName,int times){
		System.out.println("NaughtyWaiter-"+clientName+" joke "+times+" s");
	}

}
