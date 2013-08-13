package com.ucclub.aspect.ch11;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.ucclub.aspect.ch02.Waiter;

@Aspect
public class TestAspect {

	@Before("this(waiter)")
	
	public void bindProxyObj(Waiter waiter){
		System.out.println("---bindProxyObj-----");
		System.out.println(waiter.getClass().getName());
		System.out.println("-------bindProxyObj--");
	}
}
