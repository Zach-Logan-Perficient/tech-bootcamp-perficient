package com.perficient.techbootcampzach;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.perficient.techbootcampzach.entity.Account;
import com.perficient.techbootcampzach.entity.V3Matches;
import com.perficient.techbootcampzach.service.AccountDataService;
import com.perficient.techbootcampzach.service.MatchService;

@SpringBootApplication
public class TechbootcampZachApplication {
	
	@Autowired
    AccountDataService accountDataService;
	
	@Autowired
	MatchService matchService;

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
					"https://api.henrikdev.xyz/valorant/v3/matches/na/XXLozengeXX/NA1?size=11&filter=competitive", V3Matches.class);
//			logger.info("status: " + matches.getStatus() + "; length: " + matches.getData().length + "\nmatch[0]:\n" + matches.toString());
//			Account Account = restTemplate.getForObject(
//					"https://api.henrikdev.xyz/valorant/v1/account/XXLozengeXX/NA1", Account.class);
//			accountDataService.saveAccountData(Account.getData());
			matchService.saveMatches(matches.getData());
			
		};
	}
}
