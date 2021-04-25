package com.hamitmizrak.log4j2_sfl4j;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4j2Tutorials {

	public static void main(String[] args) {

		log.info("\tinfo bilgileri");
		log.error("Error bilgileri");
		log.debug("Debug bilgileri");

	}
}
