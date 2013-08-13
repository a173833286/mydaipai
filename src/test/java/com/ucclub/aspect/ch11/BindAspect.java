package com.ucclub.aspect.ch11;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BindAspect {

	@AfterReturning(value="target(com.ucclub.aspect.ch03.SmartSeller)",returning="retVal")
	public void bindReturnValue(int retVal){
		System.out.println("---bindReturnValue()---");
		System.out.println("returnValue:"+retVal);
		System.out.println("--bindReturnValue()---");
	}
}
