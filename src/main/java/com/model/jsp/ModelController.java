package com.model.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelController {

	// http://localhost:9292/model/String
	@GetMapping("/model/String")
	public String getStringModel(Model model) {
		String adSoyad = "Hamit Mızrak 44";
		model.addAttribute("keyString", adSoyad);
		return "Ders011_Model";
	}

	// http://localhost:9292/model/Object
	@GetMapping("/model/Object")
	public String getObjectModel(Model model) {
		Laptop laptop = new Laptop(100, "GL75 msi", "18");
		model.addAttribute("keyObject", laptop);
		return "Ders011_Model";
	}

}
