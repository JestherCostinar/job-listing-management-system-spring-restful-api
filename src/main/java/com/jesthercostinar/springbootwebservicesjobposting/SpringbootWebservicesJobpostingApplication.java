package com.jesthercostinar.springbootwebservicesjobposting;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Job Listing Management",
				description = "Job Listing Management - Spring Boot Application. Spring boot Restful Web application for Job Listing System using Spring MVC, Spring Boot, Spring Data JPA, Hibernate, MySQL for the database",
				version = "v1.0",
				contact = @Contact(
						name = "Jesther Costinar",
						email = "jesther.jc15@gmail.com",
						url = "https://jesthercostinar.com"
				),
				license = @License (
						name = "Apache 2.0",
						url = "https://jesthercostinar.com/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation",
				url = "https://jesther.com/user-documentation.html"
		)
)
@SpringBootApplication
public class SpringbootWebservicesJobpostingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebservicesJobpostingApplication.class, args);
	}

}
