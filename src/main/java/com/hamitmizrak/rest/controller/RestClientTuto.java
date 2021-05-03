package com.hamitmizrak.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestClientTuto {

	@GetMapping("/rest/client/violist")
	@ResponseBody
	public String getClient() {
		String uri = SabitDegisken.GETURI;
		RestTemplate restTemplate = new RestTemplate();
		// String violist=restTemplate.getForObject(uri, String.class);
		Violist violist = restTemplate.getForObject(uri, Violist.class);
		return violist.toString();
	}
}
