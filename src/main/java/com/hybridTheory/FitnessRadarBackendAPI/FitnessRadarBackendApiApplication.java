package com.hybridTheory.FitnessRadarBackendAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FitnessRadarBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessRadarBackendApiApplication.class, args);
	}

}
