package com.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.user.model.User;
import com.service.user.service.UserService;

@Controller
public class UserController {
    
	@Autowired
	private UserService userService;
	
    @GetMapping("/login")
	public String login() {
    	System.out.println("entering login..");
		return "Login";
	}
    @GetMapping("/registerUp")
	public String signUp() {
    	System.out.println("entering register..");
		return "Signup";
	}
    @PostMapping("/signIn")
	public String loginDetails(@ModelAttribute("User")  User user  ) {
        if(userService.checklogin(user)) {
        	
		return "Dashboard";
        }
        return "failure";
	}
    
    @PostMapping("/signUp")
    public String SignUpDetails(@ModelAttribute("User")  User user  ) {
    	System.out.println("entering signUp..");
        if(userService.create(user))
        	return "Success";
		return "failure";
	}
}
