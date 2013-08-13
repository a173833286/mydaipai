package com.ucclub.aspect.ch14;

public class AdviceMethods {

	public void afterReturning(int retVal){
		System.out.println("--------afterReturning");
		System.out.println("----------retVal:"+retVal);
	}
}
