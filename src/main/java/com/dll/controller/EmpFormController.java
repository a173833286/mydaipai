package com.dll.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.dll.model.Emp;

@SuppressWarnings("deprecation")
public class EmpFormController extends SimpleFormController {

	
	@SuppressWarnings("deprecation")
	@Override
	
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		Emp emp=(Emp)command;
		System.out.println(emp);
		return new ModelAndView(getSuccessView());
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("deptlist", new String []{"sales","Manages","developerment"});
		return map;
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		
	}

	

	
	
}
