package org.hbilab.spring.controller.home;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
@org.springframework.stereotype.Controller

public class HomeController{
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "notice");
		//return "/WEB-INF/views/index.jsp";
		return "home";
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
