package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView loadForm()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("userobj",new User());
		
		mv.setViewName("index");
		
		return mv;
	}
	
	
	@PostMapping("/user")
	public ModelAndView handleForm(User user)
	{
		System.out.println(user);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","user data saved success");
		mv.setViewName("result");
		
		return mv;
	}

}
