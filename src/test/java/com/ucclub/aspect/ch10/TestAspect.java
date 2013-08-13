package com.ucclub.aspect.ch10;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {
    @Before("@within(m)")
	public void bindTypeAnnoObj(Monitorable m){
    	System.out.println("---bindTypeAnno---");
    	System.out.println(m.getClass().getName());
    	System.out.println("---bindTypeAnnoObj");
    }
}
