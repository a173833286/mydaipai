package com.ucclub.aspect.ch03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.Waiter;

public class DeclareParentsTest {
  
	
	@Test
	public void testDeclareParents(){
		String configLocation="classpath*:beans.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configLocation);
		Waiter waiter=(Waiter) ctx.getBean("waiter");
		waiter.greetTo("John");
		Seller seller=(Seller)waiter;
		seller.sell("Beer","John");
	}
}
