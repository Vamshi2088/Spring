package com.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.daolayer.CarDaoImpl;

@Configuration
@Configurable
@ComponentScan(basePackages = "com.*")
public class Config {

	@Bean
	public CarDaoImpl carDaoImpl() {
		return new CarDaoImpl();
		
	}
	
	
}
