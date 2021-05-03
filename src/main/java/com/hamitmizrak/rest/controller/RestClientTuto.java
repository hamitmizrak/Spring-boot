package com.hamitmizrak.rest.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import lombok.extern.java.Log;

@Controller
@Log
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

	// exchange
	// get/post/put/delete hata ayıklama
	// http://localhost:9292/rest/client/exchange
	@GetMapping("/rest/client/exchange")
	@ResponseBody
	public String getClientExchange() {
		String uri = SabitDegisken.GETURILIST;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Violist>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, HttpEntity.EMPTY,
				new ParameterizedTypeReference<List<Violist>>() {
				});

		List<Violist> list = responseEntity.getBody();
		for (Object temp : list) {
			System.out.println(temp + "\r\n");
			log.warning(temp.toString());
		}
		return list.toString().concat("son\n");
	}

	/////////////////////////////////////////// POST(Client)////////////////////////////////////////////////////////////////////////////
	// Post
	// http://localhost:9292/rest/client/post
	@GetMapping("/rest/client/post")
	@ResponseBody
	public String postClient() {
		Violist violist = new Violist(100, "Hamit", "Mızrak", "35", "Türkiye in Malatya");
		String uri = SabitDegisken.POSTURI;
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(uri, violist, Void.class);
		return "2021 Java Spring Boot işlem yapıldı";
	}

	/////////////////////////////////////////// DELETE(Client)////////////////////////////////////////////////////////////////////////////
	// Delete
	// http://localhost:9292/rest/client/post
	@GetMapping("/rest/client/delete/{gelenId}")
	@ResponseBody
	public String getClientDelete(@PathVariable("gelenId") long violistId) {
		String uri = SabitDegisken.DELETEURI + violistId;
		RestTemplate restTemplate = new RestTemplate();

		restTemplate.exchange(uri, HttpMethod.DELETE, HttpEntity.EMPTY, Void.class);

		return "ViolistId Silindi 2021 Client";

	}
}
