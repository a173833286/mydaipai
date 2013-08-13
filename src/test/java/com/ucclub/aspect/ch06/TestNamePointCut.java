package com.ucclub.aspect.ch06;

import org.aspectj.lang.annotation.Pointcut;

public class TestNamePointCut {

	@Pointcut("within (com.ucclub.aspect..*)")
	private void inPackage(){
		
	}
	
	@Pointcut("execution(* greetTo(..)")
	protected void greetTo(){
		
	}
	
	/**@Pointcut 是命名切点注解
	 * inPackage() and greetTo() 是切点表达式
	 * public  是切点修饰符
	 * inPkgGreetTo 是切点名称
	 * 
	 */
	@Pointcut("inPackage() and greetTo()")

	public void inPkgGreetTo(){
		
	}
}
