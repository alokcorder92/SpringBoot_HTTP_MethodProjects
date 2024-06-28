package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/display")
public class DisplayController {
	
	@GetMapping("/index")
	public String showindexPage() {
		
		return "index";
	}
  
	@GetMapping("/about")
    public String showaboutPage(@RequestParam("name") String name,@RequestParam("age") Integer age,@RequestParam("address") String address) {
		
		System.out.println("Name=" +name);
		System.out.println("Age=" +age);
		System.out.println("Address=" +address);
		return "about";
	}
}
