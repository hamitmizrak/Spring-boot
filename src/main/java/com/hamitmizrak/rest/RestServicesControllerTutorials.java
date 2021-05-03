package com.hamitmizrak.rest;

import java.util.ArrayList;
import java.util.List;

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

	// Defaultu değiştirmek
	// http:localhost:9292/rest/json/string
	// @GetMapping(value = "/rest/json/stringDefault", produces =
	// org.springframework.http.MediaType.APPLICATION_JSON_UTF8)
	@GetMapping("/rest/json/stringDefault")
	public String getStringJsonDefault() {
		String stringJson = "{\r\n" + "  \r\n" + "  \"adi\":\"Hamit\",\r\n" + "  \"soyadi\":\"Mızrak\"\r\n" + "  \r\n"
				+ "}";
		return stringJson;
	}

	// defaultta Json olarak gelmektedir.
	// http:localhost:9292/rest/json/object
	@GetMapping("/rest/json/object")
	public Violist getObjectJson() {
		Violist violist = new Violist(100, "Hamit", "Mızrak", "35", "Malatya");
		violist.setViolistCountry("Malatya".toUpperCase());
		return violist;
	}

	// http:localhost:9292/rest/json/object/list
	@GetMapping("/rest/json/object/list")
	public List<Violist> getObjectJsonList() {
		List<Violist> list = new ArrayList<Violist>();
		for (int i = 0; i < 10; i++) {
			list.add(new Violist((i + 1), "Hamit " + i * 2, "Mızrak", "35", "Malatya"));
		}
		return list;
	}

}
