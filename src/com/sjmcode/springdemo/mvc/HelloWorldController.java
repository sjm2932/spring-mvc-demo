package com.sjmcode.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML Form
	@RequestMapping("/showForm")
	@CrossOrigin(origins = "*")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML Form
	@RequestMapping("/processForm")
	@CrossOrigin(origins = "*")
	public String processForm() {
		return "helloworld";
	}
	
//	// need a controller method to read for data and
//	// add data to the model
//	@RequestMapping("/processFormVersionTwo")
//	public String letsShoutDude(HttpServletRequest request, Model model) {
//		
//		// read the request parameter from the HTML form
//		String theName = request.getParameter("studentName");
//		
//		// convert the data to all caps
//		theName = theName.toUpperCase();
//		
//		// create the message
//		String result = "Yo! " + theName;
//		
//		// add message to the model
//		model.addAttribute("message", result);
//			
//		return "helloworld";
//	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model) {
	
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey My Friend from v3! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
			
		return "helloworld";		
	
	}
}
