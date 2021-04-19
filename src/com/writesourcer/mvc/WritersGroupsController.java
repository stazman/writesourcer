package com.writesourcer.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WritersGroupsController {

	@RequestMapping("/showNewGroupForm")
	private String showNewGroupForm() {
		
		return "showNewGroupForm";
		
	}
	
	@RequestMapping("/processNewGroup")
	private String processNewGroup() {
		
		return "processNewGroup";
		
	}
	
}
