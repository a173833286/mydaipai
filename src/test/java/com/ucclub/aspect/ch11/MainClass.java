package com.ucclub.aspect.ch11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucclub.aspect.ch03.SmartSeller;

public class MainClass {
	public static void main(String[] args) {

  
		String configLocation="beans-ch11.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configLocation);
		SmartSeller seller=(SmartSeller) ctx.getBean("seller");
		seller.sell("Beer", "John");
	}
}
