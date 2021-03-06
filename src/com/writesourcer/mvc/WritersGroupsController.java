package com.writesourcer.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/writersGroupMain")
public class WritersGroupsController {

	@RequestMapping("/showNewGroupForm")
	private String showNewGroupForm() {
		
		return "showNewGroupForm";
		
	}
	
	@RequestMapping("/processNewGroup")
	public String processNewGroup(	
		@RequestParam("groupModerator") String theName,
		Model model) {
		
		//This line is no longer needed, with @RequestParam
//		String theName = req.getParameter("groupModerator");
				
		theName = theName.toUpperCase();
		
		String result = "Welcome, " + theName + "!";
		
		model.addAttribute("message", result);
		
		return "processNewGroup";
	}

	
//	@RequestMapping("/processNewGroup")
//	private String processNewGroup() {
//		
//		return "processNewGroup";
//		
//	}
	
}
