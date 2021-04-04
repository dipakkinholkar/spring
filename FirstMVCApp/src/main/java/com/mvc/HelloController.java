package com.mvc;

import java.util.Date;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		
		String mypage="home";
		m.addAttribute("page" ,mypage );
		return "home";
		
	}
	
	@RequestMapping("/add")
	public String addTodo(Model m)
	{

		String add="add";
		m.addAttribute("page",add);
		return "home";	
	}
	
	@RequestMapping("/view")
	public String viewTodo(Model m)
	{
		String view="view";
		m.addAttribute("page", view);
		
		return "home";
	}
	

	}
