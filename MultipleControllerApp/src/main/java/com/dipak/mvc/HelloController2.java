package com.dipak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {

	
	@RequestMapping("/hello2")
	
	public String hello1()
	{
		return "hello2";
	}

}
