package com.dll.annation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

	/*
	 * {username} 代表代表可变参数,@PathVariable用来指定这个参数 该参数名需要与可变参数名一致
	 * */
	@RequestMapping("/start/{username}/{age}") 
	public String start(HttpServletRequest request,@PathVariable("username") String username,@PathVariable("age") Integer age){
		
		System.out.println(username+":"+age);
		return "start";
	}
}
