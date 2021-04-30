package com.hamitmizrak.entity;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

@Controller
@Log
public class EntityController {

	@Autowired(required = false)
	IComputerRepository computerRepository;

	// CREATE
	// http://localhost:9292/jpa/computer/get/insert
	@GetMapping("/jpa/computer/get/insert")
	@ResponseBody // bu olmazsa view sayfası yapalım.
	public String insertComputer() {
		ComputerEntity computerEntity = new ComputerEntity("msi", 18, "asd525");
		computerRepository.save(computerEntity); // 0=insert sıfırdan farklıysa güncelleme
		log.info(computerEntity.toString());
		return "Result:" + computerEntity;
	}

	// CREATE-2 @PostMapping
	// http://localhost:9292/jpa/computer/post/insert
	@PostMapping("/jpa/computer/post/insert")
	public String insertComputer(Model model, ComputerEntity computerEntity) {
		System.out.println(computerEntity);
		computerEntity.setComputerId(0L);
		computerEntity.setCreationDate(new Date(System.currentTimeMillis()));
		model.addAttribute("computerKey", computerEntity);
		log.info(computerEntity.toString());
		computerRepository.save(computerEntity);
		return "Jstl_Ders010_jpa_insert";
	}

	// CREATE-2 @GetMapping
	@GetMapping("/jpa/computer/post/insert")
	public String insertComputer(Model model) {
		ComputerEntity computerEntity = new ComputerEntity();
		computerEntity.setComputerId(0L);
		System.out.println(computerEntity);
		model.addAttribute("computerKey", computerEntity);
		log.info(computerEntity.toString());
		return "Jstl_Ders010_jpa_insert";
	}

}
