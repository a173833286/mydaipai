package com.ucclub.aspect.ch06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	@After("within(com.ucclub.aspect..*) && execution(* greetTo(..))") 
	public void greeToFun(){
		System.out.println("--greeToFun() executed!---");
	
    }
	
	@Before("!target(com.ucclub.aspect.ch02.NaiveWaiter) && execution(* serverTo(..))")
	public void notServerLnNaiveWaiter(){
          System.out.println("--notServerLnNaiveWaiter() executed!---");		
	}
	
	@AfterReturning("target(com.ucclub.aspect.ch02.Waiter) || target(com.ucclub.aspect.ch03.Seller)")
	public void waiterOrSeller(){
		System.out.println("---WaiterOrSeller() executed!--");
	}
}
