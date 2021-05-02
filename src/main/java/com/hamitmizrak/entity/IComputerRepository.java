package com.hamitmizrak.entity;

import org.springframework.data.repository.CrudRepository;

public interface IComputerRepository extends CrudRepository<ComputerEntity, Long> {

	// @Query("select com2 from computer com2 where com2.computerPrice=:key ");
	// List<ComputerEntity> selectComputer(String adi);
}
