package org.hbilab.spring.controller.board;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller

public class BoardController{
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String index() {
		
		//return "/WEB-INF/views/index.jsp";
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "board");
		return "board";
	}
	
}
