package com.ucclub.aspect.ch08;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	@Before("target(com.ucclub.aspect.ch02.NaiveWaiter) && args(name,num,..)")
	public void bindJoinPointParams(int num,String name){
		System.out.println("-0-----------bindJoinPointParams()--");

		System.out.println("name:"+name);
		System.out.println("num:"+num);

	System.out.println("-----1------bindJoinPointParams--");}
}
