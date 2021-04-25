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

	// +++++++++++++++++++++++ C ++++++++++++++++++++++++
	// http://localhost:9292/core/set
	@GetMapping("/core/set")
	public String getCoreSetOut() {
		return "Jstl_Ders001_Core_Set_Out";
	}

	// http://localhost:9292/core/remove
	@GetMapping("/core/remove")
	public String getRemove() {
		return "Jstl_Ders002_Core_Remove";
	}

	// http://localhost:9292/core/remove
	@GetMapping("/core/foreach")
	public String getForEach() {
		return "Jstl_Ders003_Core_ForEach";
	}

	// http://localhost:9292/core/switch-case
	@GetMapping("/core/switch-case")
	public String getSwitchCase() {
		return "Jstl_Ders004_Core_Switch_Case";
	}

	// http://localhost:9292/core/switch-case
	@GetMapping("/core/import")
	public String getImport() {
		return "Jstl_Ders005_Core_Import";
	}

	// http://localhost:9292/core/forTokens
	@GetMapping("/core/forTokens")
	public String getTokens() {
		return "Jstl_Ders006_Core_Tokens";
	}

}
