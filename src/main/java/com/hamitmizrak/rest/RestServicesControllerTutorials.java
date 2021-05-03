package com.hamitmizrak.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServicesControllerTutorials {

	// http:localhost:9292/rest/json/string
	@GetMapping("/rest/json/string")
	public String getStringJson() {
		String stringJson = "{\r\n" + "  \r\n" + "  \"adi\":\"Hamit\",\r\n" + "  \"soyadi\":\"Mızrak\"\r\n" + "  \r\n"
				+ "}";
		return stringJson;
	}

}
