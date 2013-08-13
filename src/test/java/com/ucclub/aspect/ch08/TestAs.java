package com.ucclub.aspect.ch08;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.NaiveWaiter;

public class TestAs {

	@Test
	public void testAspect(){
		
		String configLocation="beans-ch08.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configLocation);
		NaiveWaiter nw=(NaiveWaiter) ctx.getBean("naiveWaiter");
		nw.smile("Hellen", 22);
	}
}
