package com.CityWheather.SpringBootJpaRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CityWheather.Weather;

@SpringBootApplication
public class SpringBootJpaRestApplication {

	public static void main(String[] args) {
		System.out.println("Hi Weather!");
		SpringApplication.run(SpringBootJpaRestApplication.class, args);
		Weather weather = new Weather();
		weather.getCurrentWeather();
	}

}
