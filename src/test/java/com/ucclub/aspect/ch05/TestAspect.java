package com.ucclub.aspect.ch05;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {

	@AfterReturning("this(com.ucclub.aspect.ch03.Seller)")
	public void thisTest(){
		System.out.println("this Test() executed");
	}
}
