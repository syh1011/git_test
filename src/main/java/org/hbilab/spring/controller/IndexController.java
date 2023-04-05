package org.hbilab.spring.controller;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller

public class IndexController{
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index() {
		
		//return "/WEB-INF/views/index.jsp";
		return "index";
	}
	
}
/*
public class IndexController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","Hello Spring");
		mv.setViewName("/WEB-INF/views/index.jsp");
		return mv; 
	}
	
}
*/