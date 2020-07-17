package com.CityWheather;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Weather{
	
    final String uri = "http://api.weatherstack.com/";
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
	
	public void getCurrentWeather()
	{
	     
		String currentWeatherEndpoint = "current?access_key=dddbead785126d3982002b5d08462528&query=India";
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(uri+currentWeatherEndpoint, HttpMethod.GET, entity, String.class);
	     
	    System.out.println(result);
	}
}