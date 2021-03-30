package com.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	
	@RequestMapping("/hello")
	
	public String Hello()
	{
		return "index";
	}
	@RequestMapping("/hellodipak")
	
	public String HelloDipak()
	{
		return "hellodipak";
	}
	

}
