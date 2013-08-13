package com.ucclub.aspect.ch05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch02.Waiter;
import com.ucclub.aspect.ch03.Seller;

public class ThisAsoectTest {

	@Test
	public void testThisAspect() {

		String configLocation = "classpath:beans-ch05.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				configLocation);

		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");

		naiveWaiter.greetTo("John");
		naiveWaiter.serveTo("John");
		((Seller) naiveWaiter).sell("Beer", "John");
	}

}
