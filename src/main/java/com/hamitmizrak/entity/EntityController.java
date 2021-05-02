package com.hamitmizrak.entity;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

@Controller
@Log
public class EntityController {

	// @Inject
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

	// FIND
	// http:localhost:9292/jpa/computer/get/find/1
	@GetMapping("/jpa/computer/get/find/{id44}")
	@ResponseBody
	public String findComputer(@PathVariable(name = "id44") Long computerId) {
		java.util.Optional<ComputerEntity> optional = computerRepository.findById(computerId);
		if (optional.isPresent()) {
			ComputerEntity computerEntity = optional.get();
			log.info(computerEntity.toString());
			return computerEntity.toString();
		} else {
			return "aradığınız id bulunmamaktadır " + computerId;
		}
	}

	// http:localhost:9292/jpa/computer/get/update/1?computerName=msi&computerPrice=55&computerSecurity=xlk55
	@GetMapping("/jpa/computer/get/update/{id44}")
	@ResponseBody
	public String updateComputer(@PathVariable(name = "id44") Long id,
			@RequestParam(name = "computerName") String computerName,
			@RequestParam(name = "computerPrice") double computerPrice,
			@RequestParam(name = "computerSecurity") String computerSecurity) {
		java.util.Optional<ComputerEntity> optional = computerRepository.findById(id);
		if (optional.isPresent()) {
			ComputerEntity computerEntity = optional.get();
			computerEntity.setComputerName(computerName);
			computerEntity.setComputerPrice(computerPrice);
			computerEntity.setComputerSecurity(computerSecurity);
			computerEntity.setCreationDate(new Date(System.currentTimeMillis()));
			computerRepository.save(computerEntity);
			return "guncellendi" + computerEntity.toString();
		} else {
			return "aradığınız id bulunmamaktadır ve güncellenedi " + id;
		}
	}

	// http:localhost:9292/jpa/computer/get/delete/1
	@GetMapping("/jpa/computer/get/delete/{id44}")
	@ResponseBody
	public String deleteComputer(@PathVariable(name = "id44") Long id) {
		java.util.Optional<ComputerEntity> optional = computerRepository.findById(id);
		// computerRepository.deleteById(3);
		if (optional.isPresent()) {
			ComputerEntity computerEntity = optional.get();
			computerRepository.delete(computerEntity);
			return "silindi" + computerEntity.toString();
		} else {
			return "aradığınız id bulunmamaktadır ve silinemedi " + id;
		}
	}

}
