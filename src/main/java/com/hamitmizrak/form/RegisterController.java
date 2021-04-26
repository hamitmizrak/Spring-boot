package com.hamitmizrak.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@GetMapping("/post-register")
	public String getRegister(Model model) {
		// Model
		Register register = new Register(0, "", "", "", 44);
		model.addAttribute("register", register);
		return "Ders012_Form";
	}

	@PostMapping("/post-register")
	public String postRegister(Model model, Register register, BindingResult bindingResult) {
		// Model
		model.addAttribute("register", register);
		if (bindingResult.hasErrors()) {
			model.addAttribute("hata", "Hatalı alanlar var");
			System.out.println("sonuç: " + register);
			return "Ders012_Form";
		}
		System.out.println("sonuç: " + register);
		model.addAttribute("basarili", "Başarılı harikasınız");
		return "Ders013_Success";
	}
}
