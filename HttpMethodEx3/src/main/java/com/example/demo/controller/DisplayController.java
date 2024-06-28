package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayController {
	
	@GetMapping("/index")
	public String showIndexPage() {
		
		return "index";
	}
	@GetMapping("/about/{name}/{age}/{address}")
    public String showAboutPage(@PathVariable("name")String name,@PathVariable("age") Integer age,@PathVariable("address") String address) {
		
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Address="+address);
		return "about";
	}

}
