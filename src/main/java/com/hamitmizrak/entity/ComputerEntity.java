package com.hamitmizrak.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "computer")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ComputerEntity implements Serializable {
	private static final long serialVersionUID = -789752400786514451L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "computerId")
	private long computerId;

	@Column(name = "computerName", length = 150)
	private String computerName;

	@Column(name = "computerPrice", length = 250, precision = 13, scale = 4, nullable = false)
	private String computerPrice;

	@Column(name = "computerSecurityx", nullable = false, unique = true)
	private String computerSecurity;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

}
