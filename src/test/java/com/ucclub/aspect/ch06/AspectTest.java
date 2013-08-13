package com.ucclub.aspect.ch06;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectTest {

	@Before("com.ucclub.aspect.ch06.TestNamePointcut.inPkgGreetTo()")
	public void pkgGreetTo(){
		System.out.println("--pkgGreetTo() executed!--");
	}
	@Before("!target(com.ucclub.aspect.ch02.NaiveWaiter) && com.ucclub.aspect.ch06.TestNamePointcut.inPkgGreetTo()")
	public void pkgGreetToNotNaiveWaiter(){
		System.out.println("--pkgGreetToNotNaiveWaiter() executed!--");
	}
}
