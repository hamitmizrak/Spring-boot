package com.controller.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

	// http://localhost:9292/index
	@GetMapping("/index")
	public String getIndexJsp() {
		return "index";
	}

	// http://localhost:9292/core/set
	@GetMapping("/core/set")
	public String getCoreSetOut() {
		return "Jstl_Ders001_Core_Set_Out";
	}

	@GetMapping("/core/remove")
	public String getRemove() {
		return "Jstl_Ders002_Core_Remove";
	}
}
