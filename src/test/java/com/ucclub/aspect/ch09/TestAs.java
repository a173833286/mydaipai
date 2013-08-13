package com.ucclub.aspect.ch09;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.Waiter;

public class TestAs {

	@Test
	public void testaspect(){
		
		String configLocation="beans-ch09.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configLocation);
		Waiter nw=(Waiter) ctx.getBean("naiveWaiter");
		nw.greetTo("angel kitty");
	}
}
