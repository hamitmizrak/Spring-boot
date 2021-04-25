package com.controller.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class JspController {

	@GetMapping("/jsp")
	public String getIndexJsp() {
		
		return "index";
	}
}
