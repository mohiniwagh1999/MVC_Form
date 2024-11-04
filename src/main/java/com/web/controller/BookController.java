package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView loadForm()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookobj",new Book());
		mv.setViewName("bookview");
		return mv;
		
	}
	
	
	@PostMapping("/book")
	public ModelAndView handleForm(Book book)
	{
		System.out.println(book);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","book data saved");
		mv.setViewName("bresult");
		return mv;
		
	}
	

}
