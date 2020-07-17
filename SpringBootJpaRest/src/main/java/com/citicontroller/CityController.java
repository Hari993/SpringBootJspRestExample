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
	
	private Map<Integer, String> createCiti(){
		
		Map<Integer,String> cities = new HashMap<Integer, String>();
		
		 cities.put(1, "Chennai");
		 cities.put(2, "Bangalore");
		 cities.put(3, "Kolkata");
		 cities.put(4, "Mumbai");
		return cities;
	}
}

}
