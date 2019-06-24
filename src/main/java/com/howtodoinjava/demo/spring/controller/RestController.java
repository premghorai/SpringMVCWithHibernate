package com.howtodoinjava.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

 
import com.howtodoinjava.demo.spring.service.UserService;

@Controller
public class RestController {
	
	@Autowired
	private UserService userService;
	@GetMapping("hello")
	
	public  @ResponseBody String getDetails() {
		
		return "hello";
	}
	@GetMapping("gerUserList1")
	public @ResponseBody List<String>  getUserList(){
		
		ArrayList<String> al= new ArrayList<>();
		
		 al.add("prem");
		 al.add("ravi");
		
		return al;
		
	}

}
 