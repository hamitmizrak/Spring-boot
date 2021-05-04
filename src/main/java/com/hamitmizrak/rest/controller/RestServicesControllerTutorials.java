package com.hamitmizrak.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@Log
public class RestServicesControllerTutorials {

	//////////////////////////////// GET /////////////////////////////
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

	// defaults xml
	// http:localhost:9292/rest/xml/object
	@GetMapping(value = "/rest/xml/object", produces = MediaType.APPLICATION_XML_VALUE)
	public Violist getObjectXml() {
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

	// http:localhost:9292/rest/json/object/parameters/ / /
	@GetMapping("/rest/json/object/parameters/{id}/{adi}/{soyadi44}")
	public Violist getObjectJsonParameters(@PathVariable("id") long id, @PathVariable("adi") String adi,
			@PathVariable("soyadi44") String soyadi) {
		Violist violist = new Violist(id, adi, soyadi, "35", "Malatya");
		return violist;
	}

	////////////////////////////// POST ////////////////////////////////////////////
	// http://localhost:9292/rest/object/gelenVeri
	@PostMapping("/rest/object/gelenVeri")
	public void postMappingData(@RequestBody Violist violist) {
		System.out.println(violist);
		log.warning(violist.toString());
	}

	///////////////////////////// DELETE ///////////////////////////////////////////
	@DeleteMapping("/rest/object/deleteId/{id44}")
	public void deleteViolist(@PathVariable("id44") long violistId) {
		log.warning("Violist Id Silindi. Server");
		System.out.println("Violist Id Silindi. Server  " + violistId);

	}

	////////////////////////////// PUT /////////////////////////////////////////////
	@PutMapping("/rest/object/updateId/{id44}")
	public void updateViolist(@PathVariable("id44") long violistId) {
		log.warning("Violist Id güncellendi. Server");
		System.out.println("Violist Id Güncellendi (put). Server  " + violistId);

	}
}
