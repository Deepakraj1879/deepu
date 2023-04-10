package com.deepak.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_One {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("url Home controller ");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		System.out.println("url about controller");
		
		model.addAttribute("msg","spring mvc for web applications and restfull services");
		
		model.addAttribute("number",12000);
		
		return "about";
	}

	@RequestMapping("/list")
	public ModelAndView test()
	{
		System.out.println("list url controller");
		ModelAndView mav=new ModelAndView();
		
		List<String> names=new ArrayList<String>();
		names.add("rahul");
		names.add("pritam");
		names.add("priyanka");
		names.add("radhika");
		System.out.println(names);
		
		mav.addObject("list",names);
		
		mav.setViewName("list");
		
		return mav;
	}
	
	@RequestMapping("/numlist")
	public ModelAndView testnum()
	{
		System.out.println("url numlist controller");
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("message","this is list number page");
		
		List<Integer> number=new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10)
		{
			number.add(i);
		}
		
		System.out.println(number);
		
		mav.addObject("list",number);
		
		mav.setViewName("listnum");
		
		return mav;
	}
}
