package com.dll.annation.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.WebRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;

import com.dll.model.Emp;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/start", method=RequestMethod.GET )
	public String start_Get(){
		return "start_get";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.POST )
	public String start_Post(){
		return "start_post";
	}
	
	@RequestMapping(value="/{date}" , method=RequestMethod.GET)
	public void testPathVariable(@PathVariable("date") Date date){
		System.out.println(new SimpleDateFormat("yyyyMMdd").format(date));
	}
	
	@InitBinder
	public void initBinder(HttpServletRequest request,WebRequestDataBinder binder){
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyyMMdd"), false));
		
	}
	
	
	/**
	 * @param request
	 * @param response
	 * @param session   当前session必须有效
	 */
	@RequestMapping(value="/testAllArguments" , method=RequestMethod.GET)
	public void testAllArguments(HttpServletRequest request,HttpServletResponse response,HttpSession session,@RequestParam("id") Integer id,@CookieValue String cookieName,@RequestHeader("user-agent") String userAgent){
       System.out.println(id);
      
	}
	
	/**
	 * @param out  相对于从 response.getWriter()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping
	public String testPrintWriter(PrintWriter out,Map model){
	
					model.put("", "");
					return "viewName";
	}
	
	
	/**
	 * @param emp  数据绑定
	 * @param result  数据绑定结果
	 * @return
	 */
	public String testComand(Emp emp,BindingResult result){
		return "";
	}
	
	@RequestMapping("/default")
	public void testDefaultView(){
		//没有任何输出
		//生成隐含的viewName  --按请求路径   ${appName}/test/default.html --->test/default--->Resolver配置的prefix+test/default+Resolver配置的suffix|("/WEB/INF/pages/test/default.jsp")
	}
	
	
	public Emp testEmp(){   //加入到Model中   put(key,value)  model("emp",emp)
		return new Emp();
	}
	
	public List<Emp> testList(){//加入到Model中   put(key,value)  model("empList",emp)
		return new ArrayList<Emp>();
	}
	
	public Model testModel(){    //key做veiwName 
		return new ExtendedModelMap();
	}
	
	public ModelAndView testModelAndView(){ 
		return new ModelAndView();
	}
}
