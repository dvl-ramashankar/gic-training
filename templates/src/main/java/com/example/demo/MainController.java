package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute AdharCard adharCard) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AdharCard");
		modelAndView.addObject("AdharCard", adharCard);
		return modelAndView;
	}
}
