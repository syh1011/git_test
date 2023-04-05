package org.hbilab.spring.controller.menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class MenuController{
	
	@RequestMapping(value="/menu", method = RequestMethod.GET)
	public String index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "home");
		return "menu";
	}
	
}
