package com.perficient.techbootcampzach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampzach.service.KillEventService;

@RestController
@RequestMapping("/KillEvent")
public class KillEventController {
	@Autowired
	KillEventService killService;
	
	@CrossOrigin
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		return "<h1>YO???!</h1>";
	}
	
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = "/{player}/{map}/{side}/{weapon}")
	String[][] getdata(@PathVariable String player, @PathVariable String map, @PathVariable String side, @PathVariable String weapon) {
	    
	    return killService.getDataToShow(player, map, side, weapon);
	}
}
