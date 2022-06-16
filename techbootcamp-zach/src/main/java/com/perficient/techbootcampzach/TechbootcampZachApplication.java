package com.perficient.techbootcampzach;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.perficient.techbootcampzach.responseobjects.Account;
import com.perficient.techbootcampzach.responseobjects.V3Matches;

@SpringBootApplication
public class TechbootcampZachApplication {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(TechbootcampZachApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			V3Matches matches = restTemplate.getForObject(
					"https://api.henrikdev.xyz/valorant/v3/matches/na/XXLozengeXX/NA1", V3Matches.class);
			logger.info("status: " + matches.getStatus() + "; length: " + matches.getData().length + "\nmatch[0]:\n" + matches.getData()[0].toString());
		};
	}
}
