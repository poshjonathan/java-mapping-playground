package com.home.playground1;

import com.home.playground1.enumeration.CommandType;
import com.home.playground1.service.MappingService;
import com.sun.javafx.collections.MappingChange;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Playground1Application {

	private static Logger logger = LogManager.getLogger(Playground1Application.class);

	@Autowired
	MappingService mappingService;

	public static void main(String[] args) {
		SpringApplication.run(Playground1Application.class, args);


	}



}
