package com.aseguradora.microbackpolizas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroBackPolizasApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MicroBackPolizasApplication.class, args);
	}
	
}
