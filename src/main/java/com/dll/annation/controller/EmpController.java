package com.dll.annation.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.WebRequestDataBinder;

import com.dll.model.Emp;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@RequestMapping(method=RequestMethod.GET)
	public String addForm(){
		return "manager";
	}
	

	@RequestMapping(method=RequestMethod.POST)
	public String addFormSuccess(@Valid Emp emp,BindingResult result){
		
		if(result.hasErrors()){
			return "error";
		}
		System.out.println(emp);
		return "redirect:/manager_success";
	}
	
	@InitBinder
	public void initBinder(WebRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}
