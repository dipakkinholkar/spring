package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String Hello()
	{
		return "view";
	}
	
	@RequestMapping("/hellofinal")
	
	public String HelloFinal()
	{
		return "final";
	}
}
