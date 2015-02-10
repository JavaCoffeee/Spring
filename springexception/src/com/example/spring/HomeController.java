package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public ModelAndView viewStudent(){		
		return new ModelAndView("view","command",new Student());		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("command")Student student,ModelMap model){
		if(student.getName().length()>2){
			throw new SpringException("Given name is too long");
		}else{
			model.addAttribute("name", student.getName());
		}
		model.addAttribute("id", student.getId());
		
		return "add";
	}
}
