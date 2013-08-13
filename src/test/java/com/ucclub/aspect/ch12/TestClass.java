package com.ucclub.aspect.ch12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.Waiter;

public class TestClass {

	@Test
	public void testMainClass(){
		String configLocation="beans-ch12.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configLocation);
		Waiter naiveWaiter=(Waiter) ctx.getBean("naiveWaiter");
		Waiter naugtyWaiter=(Waiter) ctx.getBean("naughtyWaiter");
		naiveWaiter.greetTo("Seller");
		naugtyWaiter.greetTo("Sally");
	}
}
