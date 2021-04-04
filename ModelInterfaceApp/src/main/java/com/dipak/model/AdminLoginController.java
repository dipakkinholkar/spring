package com.dipak.model;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminLoginController {

	@RequestMapping("/login")
	public String login(HttpServletRequest req, Model m) {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (username.equalsIgnoreCase("dipak") && password.equals("dipak")) {
			
			String msg = "Hello  " + username;

			m.addAttribute("message", msg);

			return "success";

		} else

		{
			String msg = "sorry " + username + " You entered incorrect password";
		
			m.addAttribute("message", msg);

			return "failed";
		}

	}

}
