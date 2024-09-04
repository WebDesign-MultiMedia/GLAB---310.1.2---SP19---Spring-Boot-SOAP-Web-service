package com.perscholas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.perscholas"})
public class SpringSoapDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSoapDemoApplication.class, args);
	}

}
