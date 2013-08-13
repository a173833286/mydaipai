package com.ucclub.aspect.ch04;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
    @AfterReturning("@annotation(com.ucclub.aspect.ch01.NeedTest)") //后置增强切面
	public void needTestFun(){ 
		System.out.println("execute needTestFun");
		
	}
}
