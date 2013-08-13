package com.ucclub.aspect.ch03;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableSellerAspect {

	@DeclareParents(value="com.ucclub.aspect.ch02.NaiveWaiter", defaultImpl=SmartSeller.class) //为NaiveWaiter添加接口实现，默认接口实现类
	public Seller seller; //要实现的目标接口
	
}
