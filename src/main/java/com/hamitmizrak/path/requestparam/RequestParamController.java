package com.hamitmizrak.path.requestparam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

	// http://localhost:9292/path/request-param?adi="Hamit"&soyadi="Mizrak"
	@GetMapping("/path/request-param")
	public String getRequestParam(Model model,
			@RequestParam(name = "adi", required = false, defaultValue = "adiniz-alani") String adi,
			@RequestParam(name = "soyadi", required = false, defaultValue = "soyadi-alani") String soyadi) {
		model.addAttribute("requestParamKey", adi + " " + soyadi);
		return "Ders014_RequestParam";
	}
}
