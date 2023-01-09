package com.sjmcode.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
public class SillyController {
	
	@RequestMapping("/showForm")
	@CrossOrigin(origins = "*")
	public String displayTheForm() {
		return "silly";
	}

}
