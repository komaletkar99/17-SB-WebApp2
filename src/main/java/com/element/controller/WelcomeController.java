package com.element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
 
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		String msg = "Hi welcome to 4element softech";
		ModelAndView mav = new ModelAndView();
		mav.addObject("welcomeMsg", msg);
		mav.setViewName("index");
		
		return mav;
	}
}
