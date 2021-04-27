package com.hamitmizrak.path.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.extern.java.Log;

@Controller
@Log
public class PathValueController {

	// http://localhost:9292/path/path-variable/HamitMizrak
	@GetMapping({ "/path/path-variable/{adi}", "/path/path-variable" })
	public String getPathValue(Model model, @PathVariable(name = "adi", required = false) String adi) {

		if (adi != null) {
			model.addAttribute("path44", "Sonuc: " + adi);
			log.info(adi);
			System.out.println(adi);
		} else {
			model.addAttribute("path44", "birşey yoktur");
			log.info("birşey yok 2021");
			System.out.println("birşey yok 2021");
		}
		return "Ders015_PathVariable";
	}
}
