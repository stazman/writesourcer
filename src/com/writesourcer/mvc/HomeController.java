package com.writesourcer.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	private String showPage() {
		
		return "main-menu";
		
	}
}

