package com.ucclub.aspect.ch04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.Waiter;

public class PointCutFunTest {

	
	@Test
	public void testPointCut(){
		String contextPath="classpath:beans-ch04.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(contextPath);
		Waiter naiveWaiter= (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter=(Waiter) ctx.getBean("naughtyWaiter");
		
		naiveWaiter.greetTo("John");
		naughtyWaiter.greetTo("Tom");
	}
}
