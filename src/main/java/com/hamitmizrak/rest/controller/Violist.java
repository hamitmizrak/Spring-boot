package com.hamitmizrak.rest.controller;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Violist implements Serializable {
	private static final long serialVersionUID = 8457143199546718311L;

	private long violistId;
	private String violistName;
	private String violistSurname;
	private String violistAge;
	private String violistCountry;
}
