package com.citicontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/citis")
public class CityController {
	
	@GetMapping(path="/", produces = "application/json")
	public String getAllCities() 
	{
	    return "Chennai";
	}
	
	
}
