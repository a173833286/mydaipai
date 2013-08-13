package com.ucclub.aspect.ch02;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;


public class AspectJProxyTest {
	@Test
 public void testAspectJProxy(){
	
            Waiter target=new NaiveWaiter();
			//
            AspectJProxyFactory factory=new AspectJProxyFactory();
			//设置目标对象
			factory.setTarget(target);
			
			//添加切面类
			factory.addAspect(PreGreetingAspect.class);
		
			//生成植入切面的代理对象
		   Waiter proxy=factory.getProxy();
		   
		   proxy.greetTo("John");
		   proxy.serveTo("John");
	
 }
}
