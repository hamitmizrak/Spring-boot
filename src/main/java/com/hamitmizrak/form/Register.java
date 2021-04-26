package com.hamitmizrak.form;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register implements Serializable {
	private static final long serialVersionUID = -6825855361596258799L;

	private long id;
	private String name;
	private String surname;
	private String email;
	private int password;
}
