package com.hamitmizrak.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestClientTuto {

	// getForObject
	// Direk çalışmak istiyorsak
	@GetMapping("/rest/client/getforobject")
	@ResponseBody
	public String getClientForObject() {
		String uri = SabitDegisken.GETURIOBJECT;
		RestTemplate restTemplate = new RestTemplate();
		// String violist=restTemplate.getForObject(uri, String.class);
		Violist violist = restTemplate.getForObject(uri, Violist.class);
		return violist.toString();
	}

}
