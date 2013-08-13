package com.ucclub.aspect.ch07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.Waiter;

public class Ch07Test {

	@Test
	public void testAspect(){
		String configLocation="classpath:beans-ch07.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configLocation);
		Waiter waiter=(Waiter) ctx.getBean("naiveWaiter");
		waiter.greetTo("Hellen");
	}
}
