package com.ucclub.aspect.ch01;

import java.lang.reflect.Method;


public class TestTool {

	@SuppressWarnings("rawtypes")
	public static void main(String [] args){
		Class clazz=ForumService.class;
		Method [] mds=clazz.getDeclaredMethods();
		System.out.println(mds.length);
		for (Method method : mds) {
			NeedTest nt=method.getAnnotation(NeedTest.class);
			if(nt!=null){
				if(nt.value()){
					System.out.println(method.getName()+ "需要测试");
				}else{
					System.out.println(method.getName()+"不需要测试");
				}
			}
		}
	}
}
