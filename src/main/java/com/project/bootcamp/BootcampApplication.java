package com.project.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}
	
	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().info(new Info()
				.title("API_Stock_Santander")
				.version("1.0")
				.termsOfService("https://smartbear.com/terms-of-use/")
				.license(new License()
						.name("Apache 2.0")
						.url("https://springdoc.org/")));
	}

}
