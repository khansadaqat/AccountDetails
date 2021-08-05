package com.account.details.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.details.service.AccountDetailsService;

@RestController
public class AccountDetailsController {
	@Autowired
	AccountDetailsService service;
	
	@GetMapping("/test")
	public String testAPI() {
		return "API OK";
	}
	@GetMapping("/admin/acountstatus/check")
	public String testAPIAdmin() {
		service.getAccountDetails();
		return "API OK--ADMIN";
	}
	
	@GetMapping("/user/acountstatus/check")
	public String testAPIUser() {
		return "API OK2 -->user";
	}
	@GetMapping(value="/logout")  
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
        if (auth != null){      
           new SecurityContextLogoutHandler().logout(request, response, auth);  
        }  
         return "User logged out";  
     }

}
