package com.shopeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ShopEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopEasyApplication.class, args);
	}

}
