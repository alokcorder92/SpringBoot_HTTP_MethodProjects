package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayController {
	
	@GetMapping("/index")
	public String getIndexPage() {
		 return "index";
	}	 
		 
	@GetMapping("/contact")
	public String contactPage() {
		 return "contact";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		  return "about";
	}
	
	@PostMapping("/feedback")
	public String feedbackPage() {
	      return "feedback";		 
		
	}

}
