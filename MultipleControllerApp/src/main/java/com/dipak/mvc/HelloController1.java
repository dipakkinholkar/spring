package com.dipak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	
	@RequestMapping("/hello1")
	
	public String hello1()
	{
		return "hello1";
	}

}
