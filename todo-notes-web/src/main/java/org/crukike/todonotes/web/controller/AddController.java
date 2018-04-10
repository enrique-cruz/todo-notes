package org.crukike.todonotes.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam ("t2") int num2) {
		ModelAndView model = new ModelAndView();
		
		int r = num1 + num2;
		model.addObject("result", r);
		model.setViewName("result.jsp");
		
		return model;
	}
}
