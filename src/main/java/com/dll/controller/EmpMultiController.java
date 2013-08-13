package com.dll.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.dll.model.Emp;

public class EmpMultiController extends MultiActionController {

	 
	public ModelAndView reManage(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("manage");
		mav.addObject("deptlist", new String[]{"sales","Manages","developerment"});
		return mav;
	}
	
	public String doManage(HttpServletRequest request,HttpServletResponse response,Emp emp){
		System.out.println(emp);
		return "manage_success";
	}
	
	
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}
