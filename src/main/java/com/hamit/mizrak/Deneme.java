package com.hamit.mizrak;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Deneme {

	@GetMapping("/hamit-mizrak")
	@ResponseBody
	public String testMethod44() {
		return "Merhabalar Güzel İnsanlar, Spring Framework Spring Boot Eğitmeni Hamit Mızrak";
	}
}
