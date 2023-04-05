package org.hbilab.spring.controller.notice;
import javax.servlet.http.HttpServletRequest;



import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller

public class NoticeController{
	
	@RequestMapping(value="/notice", method = RequestMethod.GET)
	public String index() {


		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "notice");
		return "notice";

	}
	
}
