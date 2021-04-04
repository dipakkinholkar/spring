package com.mvc.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamLoginApp {

	@RequestMapping("/loginpage")
	public String helloApp(@RequestParam("username") String uname , @RequestParam("password") String pass , Model m)
	{
		
		if(uname.equals("dipak") &&  pass.equals("dipak"))
		{
			String msg="Hello  "+uname;
			m.addAttribute("message",msg );
			return "success";
		}
		else
		{

			String msg="Sorry "+uname+" you entered wrong details";
			m.addAttribute("message", msg );
			return "failed";
		}
		
	}
}
