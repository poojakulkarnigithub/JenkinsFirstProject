package com.yash;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("appln started");
	}
	
	public static void main(String[] args) {
		logger.info("appln executed....");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
