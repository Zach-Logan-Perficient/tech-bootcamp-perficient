package com.perficient.techbootcampzach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LandingController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final Date dateNow = new Date();
	
    @RequestMapping("/")
    @ResponseBody
    public String goToLanding () {
    	
        logger.error("error at {}??", dateNow.toString());
        logger.info("no, there is no error right now!");     
        return "<h1>Hi!</h1>";
    }
}
